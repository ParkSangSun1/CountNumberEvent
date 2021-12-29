# CountNumberEvent
![Jit](https://img.shields.io/jitpack/v/github/ParkSangSun1/CountNumberEvent?style=for-the-badge&color=2F9319) 

🪄 This is an animation library with an increasing number of TextViews

## Demo
###### ![Count1](https://user-images.githubusercontent.com/67040465/147655354-f6cd871b-6fe3-4107-bc10-985d56ae45ca.gif)

###### <br>
## Setup

Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        //...omitted for brevity
        maven { url 'https://jitpack.io' }
    }
}
```



Add the dependency

```groovy
dependencies {
   implementation "com.github.ParkSangSun1:CountNumberEvent:$latest_release"
}
```
<br>

## Usage
#### form
```
countNumber(startCount, endCount, txtView, duration)
```
startCount : The first number<br>
endCount : The last number<br>
txtView : TextView to be displayed<br>
duration : It's time to increase the number (1000 = 1 second)<br>

#### Example
```
countNumber(0,500,binding.txtView, 3000)
```
