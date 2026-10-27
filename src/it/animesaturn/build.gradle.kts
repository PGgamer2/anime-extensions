plugins {
    alias(kei.plugins.extension)
}

yuzono {
    name = "Anime Saturn"
    className = "AnimeSaturn"
    versionCode = 15
    contentWarning = ContentWarning.SAFE
    libVersion = "16"
}

dependencies {
    implementation(project(":lib:playlistutils"))
}
