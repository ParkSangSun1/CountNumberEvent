# CountNumberEvent
[![](https://jitpack.io/v/ParkSangSun1/countnumberevent.svg)](https://jitpack.io/#ParkSangSun1/countnumberevent)

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

### Licensed under the [MIT License](LICENSE)

```
MIT License

Copyright (c) 2021 ParkSangSun

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
