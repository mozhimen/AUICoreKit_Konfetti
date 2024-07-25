plugins {
//    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
    id("org.jetbrains.dokka") version "1.7.0"
}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")//${Constants.kotlinVersion}")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
        classpath("com.diffplug.spotless:spotless-plugin-gradle:6.23.3")
        classpath("io.github.gradle-nexus:publish-plugin:1.3.0")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.7.0")
    }
}

//// Connect with the repository using properties from local.properties in the root of the project
//val properties = File(rootDir, "local.properties")
//if(properties.exists()) {
//    val localProperties = properties.inputStream().use { java.util.Properties().apply { load(it) } }
//    // Set up Sonatype repository
//    nexusPublishing {
//        repositories {
//            sonatype {
//                stagingProfileId.set(localProperties["sonatypeStagingProfileId"] as String?)
//                username.set(localProperties["ossrhUsername"] as String?)
//                password.set(localProperties["ossrhPassword"] as String?)
//            }
//        }
//    }
//}
