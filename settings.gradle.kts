pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "FollowBook"
include(":a1_display")
include(":a2_otherview")
include(":a3_basicitem")
include(":a4_aboutbutton")
include(":a5_imagebutton")
include(":a6_calculator")
include(":b1_mediumitem")
include(":b2_spinner")
include(":b3_edittext")
include(":b4_jump")
include(":c1_timeitem")
include(":b5_intent")
include(":b6_others")
