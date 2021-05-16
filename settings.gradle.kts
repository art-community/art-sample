rootProject.name = "art-sample"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://nexus.art-platform.io/repository/art-gradle-plugins/") }
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.contains("art")) {
                useModule("io.art.gradle:art-gradle:main")
            }
        }
    }
}
