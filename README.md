

This project is a reproducer for the following bug report:

https://github.com/quarkusio/quarkus/issues/27075

# Requirements

- Having graalvm 21.3.0 Java 11 CE installed and GRAALVM_HOME environment variable pointing on the installation location

# How to reproduce

- Change the quarkus version from 2.9.2 to 2.10.0
- Run `mvn clean verify -Pnative`
