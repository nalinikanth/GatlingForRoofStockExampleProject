# System setup steps
 
### System requirements
1. Homebrew (Package Manager for Mac)
2. Java.
3. Gradle - We are using gradle build tool for this project.
4. Any IDE - to make life simpler. We are using Intellij(optional).
5. Add Scala plug in.

## Steps for setting up Mac
##### 1. Install Homebrew
Run this command on the terminal:
```sh
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

##### 2. Install Java and 
Now that you have homebrew,you can get JDK using Homebrew cask.


```sh
$ brew cask install java
```



##### 3. Install gradle
We have installed using homebrew

```sh
$ brew install gradle
```


##### 4. Install the IDE (optional)
We have used community edition of Intellij from https://www.jetbrains.com/idea/


##### 5. Add Scala plugin to IDE 
On Startup IntelliJ gives an option to add Scala plugin. You can check it and install on launching IntelliJ for the first time.
Otherwise, as soon as you add "apply plugin: "scala" in your build.gradle, IntelliJ prompts you to download scala plugin.



## Steps for setting up Windows
##### 1. Install Chocolatey 
Chocolatey is a package installer for windows. We found it easier to set up with this. You can find more information and download from https://chocolatey.org/

##### 2. Install Java(JRE & JDK)
Now that you have chocolatey,you can get JDK using Homebrew cask.


```sh
$ choco install javaruntime -y
$ choco install jdk -y
```



##### 3. Install gradle
We have installed using homebrew

```sh
$ choco install gradle
```


##### 4. Install the IDE(or any other IDE - optional)
We have used community edition of Intellij from https://www.jetbrains.com/idea/


##### 5. Add Scala plugin to IDE 
On Startup IntelliJ gives an option to add Scala plugin. You can check it and install on launching IntelliJ for the first time.
Otherwise, as soon as you add "apply plugin: "scala" in your build.gradle, IntelliJ prompts you to download scala plugin.


##### Other instruction
Might have to download and install scala sdk. Remember it giving some issues during a walkthrough

##### To run the tests
Import gradle.build file in your IDE (I use IntelliJ)

Gradle task in this particular example project is designed to run all tests in simulations folder.
To run all tests execute
 
'gradle clean gatling'

 
 
