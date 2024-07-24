object buildVersions {
    const val compileSdk = 34
    const val targetSdk = 34
}

object Constants {
    const val composeVersion = "1.4.3"
    const val konfettiVersion = "2.1.0-beta01"
    const val kotlinVersion = "1.9.22"
}

object NexusConfig {
    const val PUBLISH_GROUP_ID = "nl.dionsegijn"
    const val PUBLISH_VERSION = Constants.konfettiVersion
    var PUBLISH_ARTIFACT_ID = ""
}