# MyFirstApp
CSCI E-37 Assignment 5 : First Localized App

### Build
```shell
./gradlew installDebug
```
This should build the app apk under `./app/build/outputs/apk/debug/app-debug.apk`
The same apk has been copied under `./apk/app-debug.apk`

### Emulator
Before proceeding further, we need to start the local emulator. For this assignment I have used Pixel_3_API_28
To start an emulator:
```shell
./emulator -avd "Pixel_3_API_28"
```
The emular should be up and running after this command.

### Install
#### Install MoreLocale 2 (Not required if you are using System Language settings to switch languages)
```shell
./adb install ./apk/MoreLocale2.apk 
```

#### Install MyFirstApp apk into the emulator
```shell
./adb install ./apk/app-debug.apk 
```

This installs MoreLocale2 and MyFirstApp app in the emulator running. Once both the apps are installed, we need to give permissions to MoreLocale2 to modify system Locales

```shell
./adb shell pm grant jp.co.c_lis.ccl.morelocale android.permission.CHANGE_CONFIGURATION
```

### Run application
```shell
./adb shell am start -n "com.example.myfirstapp/com.example.myfirstapp.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER
```

Now you should be able to view the MyFirstApp running on your android emulator.

You can switch locales by going to system settings and changing language/region or by using MoreLocale2 application.

### Screenshots:

Set Locale using System snapshot: 
![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/SystemLocale.png "System Locale")

Setting Locale to ar_AE:
![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/ar_AE_Home.png "ar_AE Home screen")

![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/ar_AE_App.png "ar_AE App screen")


Setting Locale to fr_FR:
![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/fr_FR_Home.png "fr_FR Home screen")

![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/fr_FR_App.png "fr_FR App screen")


Setting Locale to en_US:
![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/en_US_App.png "en_US App screen")


Set Locale using MoreLocale2 (Optional): 
![alt text](https://github.com/pritamdey251/MyFirstApp/blob/master/img/MoreLocale2.png "MoreLocale 2")


