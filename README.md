
**Viglet Darwin Data** is a Data Governance and Metadata framework.
 
**If you'd like to contribute to Viglet Darwin, be sure to review the [contribution
guidelines](CONTRIBUTING.md).**

**We use [GitHub issues](https://github.com/opendarwin/darwin/issues) for tracking requests and bugs.**

# Installation

## Deploy 

### 1. Runtime

Use Gradle to execute Viglet Darwin, without generate jar file.

```shell
$ ./gradlew bootrun
```


### 2. Or Generate JAR File

Use Gradle to generate Viglet Darwin executable JAR file.

```shell
$ ./gradlew build
```

#### 2.1 Run

To run Viglet Darwin executable JAR file, just execute the following line:

```shell
$ java -jar build/libs/viglet-darwin.jar
```

## Viglet Darwin
* Administration Console: [http://localhost:2730](http://localhost:2730).