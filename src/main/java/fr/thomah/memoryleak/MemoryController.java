package fr.thomah.memoryleak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MemoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemoryController.class);

    ArrayList<byte[]> al = new ArrayList<>();

    @RequestMapping(value = "/compute", method = RequestMethod.GET)
    public void leak() {
        al.add(new byte[100000000]);
        long mem = Runtime.getRuntime().totalMemory();
        LOGGER.info("Total memory: " + mem);
    }

    @RequestMapping(value = "/purge", method = RequestMethod.GET)
    public void purge() {
        al = null;
        System.gc();
        al = new ArrayList<>();
        long mem = Runtime.getRuntime().totalMemory();
        LOGGER.info("Total memory: " + mem);
    }

}
