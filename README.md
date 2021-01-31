# Memory Leak

A stupid app that consume memory

## Build

The app only :

````bash
./gradlew build
````

The app + Docker image :

````bash
./gradlew bootBuildImage --imageName=thomah/memoryleak
````

## Run

### Run with Gradle

```bash
./gradlew bootRun
```

### Run with Docker

```bash
docker run -d --name memoryleak \
  -p 8080:8080 \
  thomah/memoryleak:<tag>
```

## Use

### Consume memory

```bash
curl --head --location 'http://localhost:8080/compute'
```

