# Semux Java SDK

This is the Java SDK for interacting with [Semux Network](https://github.com/semuxproject/semux-core).

## Building from source

Prerequisites:
- Java 8 or above

Command:
```shell
git clone https://github.com/semuxproject/semux-java
cd semux-java
./gradlew build
```

## Using as a library

First, add the Jitpack repository:
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Then, declare `semux-java` as a dependency
```
<dependency>
    <groupId>com.github.semuxproject</groupId>
    <artifactId>semux-java</artifactId>
    <version>{git.commit.id}</version>
</dependency>
```

See example [here](./example).

## License

[MIT License](./LICENSE)