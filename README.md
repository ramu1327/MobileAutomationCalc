Required Softwares
-------------------
* Android Studio
	- set environment variables under system variables (path)
		* C:\Users\lenovo\AppData\Local\Android\Sdk
		* C:\Users\lenovo\AppData\Local\Android\Sdk\tools
		* C:\Users\lenovo\AppData\Local\Android\Sdk\platform-tools
		* C:\Users\lenovo\AppData\Local\Android\Sdk\tools\bin
	- to create virtual device
		* --> Tools --> Device Manager
* Eclipse IDE
	- Add plugin: Maven (m2e)
	- Add plugin: TestNG
* JDK 1.8
	- set environment variables under system variable (path)
		* C:\Program Files\Java\jdk1.8.0_202\bin
	- check in command prompt: java
	- check in command prompt: javac
* Node JS
	- set environment variables under system variable (path)
		* C:\Program Files\nodejs\
		* C:\Program Files\nodejs\node_modules\npm\bin
* Appium
	- Host: 127.0.0.1
	- port: 4723
	- click on Edit Configuration
		* ANDROID_HOME	: C:\Users\lenovo\AppData\Local\Android\Sdk
		* JAVA_HOME	: C:\Program Files\Java\jdk1.8.0_202
* APK App Info on Google Play (In Android Device/Emulator)
* Maven
	- check in command prompt: mvn --version 


Developer Mode Ativation in Android Device/Emulator
----------------------------------------------------
settings  --> about phone  -->  Software information
-->  Then tap 7 times on Build number


Enable Debugging mode in Android Device/Emulator
------------------------------------------------
settings --> system  --> Developer optings  --> USB debugging (Enable)

UIAutomator (To inspect Elements)
---------------------------------
step 1: open Android-Studio --> Tools --> SDK Manager --> copy Android SDK Location path "C:\Users\lenovo\AppData\Local\Android\Sdk"
step 2: navigate in File Explorer upto C:\Users\lenovo\AppData\Local\Android\Sdk
step 1: navigate to C:\Users\lenovo\AppData\Local\Android\Sdk\tools\bin
step 2: double click on uiautomatorviewer


To check connected devices in cmd
---------------------------------
1. go to folder:  "cd C:\Users\lenovo\AppData\Local\Android\Sdk\platform-tools"
2. Open command prompt there
3. Enter command "adb devices"



Before Execute Script:
----------------------
1. Open virtual device in android studio/connect real device with cable
2. Check in command prompt: adb devices
3. Open Appium --> Start Server


To execute script in Eclipse IDE
--------------------------------
0. clone/download the project
1. Open Eclipse IDE
2. Click on File Menu
3. click on Open Projects from file system...
4. click on Directory
5. Select the Downloaded project from local machine
6. Click on Finish
7. Right click on project "MobileAutomationCalc" --> Run As --> Maven Clean
8. Right click on project "MobileAutomationCalc" --> Run As --> Maven Install
9. Right click on project "MobileAutomationCalc" --> Maven  --> Update Project
10. Expand "MobileAutomationCalc" --> Expand "src/test/java/ --> Expand "com.testscript"
11. Right click on "MobileAutomationCalc.java" --> Run As --> TestNG Test
