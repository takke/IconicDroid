plugins {
  id("com.android.library")
}

android {
  namespace = "com.atermenji.android.iconicdroid"

  compileSdk = rootProject.ext.get("compileSdkVersion") as Int
  buildToolsVersion = rootProject.ext.get("buildToolsVersion") as String

  defaultConfig {
    minSdk = rootProject.ext.get("minSdkVersion") as Int
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }
}
