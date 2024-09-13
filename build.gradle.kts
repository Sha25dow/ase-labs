plugins {
    java
}

java.toolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
}

val slf4jVersion = "1.7.36"
val log4jVersion = "2.23.1"
val picoCliVersion = "4.7.6"
val junitVersion = "5.10.0"

dependencies {
    // implementation -> build and runtime
    implementation("org.slf4j:slf4j-api:$slf4jVersion") // logging API: slf4j
    implementation("info.picocli:picocli:$picoCliVersion")

    // not used during build time
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:$log4jVersion") // logging implementation: log4j

    // just for test source set
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}