plugins {
    `java-library`
    id("art-jvm")
}

repositories {
    mavenCentral()
}

tasks.withType(type = Wrapper::class) {
    gradleVersion = "7.0"
}

dependencies {
    compileOnly("org.projectlombok", "lombok", "+")
    annotationProcessor("org.projectlombok", "lombok", "+")
}

art {
    modules {
        embedded {
            java {
                core()
                configurator()
                yamlConfiguration()
                logging()
                launcher()
            }
        }
    }
    executable {
        main("Example")
        jar()
    }
}
