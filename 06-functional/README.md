<link rel='stylesheet' href='../assets/css/main.css'/>

# Lab: Higher Order Functions

### Overview
Write and use higher order functions.  
We are going to use IntelliJ to implement the lab.

### Depends On 
None

### Run time
20 mins

## Step 1 : Start IntelliJ

<img src="../assets/images/intellij1.png" style="border: 5px solid grey ; max-width:100%;" />

## Step 2 : Create A New Scala Project
* Click `New Project` or `File -> New Project`
* Select `~/scala-labs/06-functional/` directory
* Set Project Name to `timer`
* Make sure `Java SDK` has a value
* Make sure `Scala SDK` has a value 
    - If the value is missing click on `create` button to select a Scala SDK.  Any version is fine, latest 2.11.x is recommended.

<img src="../assets/images/intellij_new_project.png" style="border: 5px solid grey ; max-width:100%;" />

You may want to setup views as follows

<img src="../assets/images/intellij_views.png" style="border: 5px solid grey ; max-width:100%;" />


## Step 3 : Create a Scala Object 'MyTimer'
Let's create a file called `MyTimer.scala`.   
* `Right Click on src` --> `New` --> `Scala class`
* Give it name : `MyTimer`
* Select type : `Object`

<img src="../assets/images/intellij_new_scala_class.png" style="border: 5px solid grey ; max-width:100%;" />

<img src="../assets/images/intellij_new_scala_class2.png" style="border: 5px solid grey ; max-width:100%;" />

## Step 4 :  Add a 'timeit' function

```scala

object MyTimer {
    def timeit[R](block: => R): R = {
        // look up 'java System class nano time'
        // http://docs.oracle.com/javase/8/docs/api/java/lang/System.html

        // TODO-1  : mark the time
        val t1 = System.??? 
        val result = block    // call-by-name, save the result
        // TODO-2  : mark the time again
        val t2 = System.???
        println("### timeit() : Elapsed time:  %,d  ms".format( (t2 - t1) /1000000 ) )

        result // return the result
    }
}

```

## Step 5 : Create a Test Class
Let's create a file called `TestTimer.scala`.   
Hint : `New --> Scala Class`  
Make sure it is an `Object`

Let's measure the time taken for `sleepy` function.

```scala
import MyTimer._

object TestTimer {

    def sleepy (duration : Int) = {
        Thread.sleep(duration)
        println ("yawn... slept for " + duration)
        duration
    }

    def main(args: Array[String]): Unit = {
      val a = MyTimer.timeit(sleepy(300))
      println ("result 1 : " + a)
    }
}
```

## Step 6 : Run the TestTimer
* Right click on TestTimer
* Choose Run

<img src="../assets/images/intellij_run_class.png" style="border: 5px solid grey ; max-width:100%;" />

You will output like this
```console
    yawn ... slept for 300
    ### timeit() : elapsed time : 660 ms
    result 1 : 300
```


## Step 7 : Time the following operations
Make needed changes to TestTimer.scala

#### How long the operation `1+2` takes
Hint:
```
    timeit { 1 + 2}
```

#### How long does it take to calculate squares of million numbers (1 to 1000000)
Hint : 
```scala
    val x = 1 to 1000000
    timeit { x.map(???) }  // TODO : figure out code for squaring
```

## Lab End

Following are for reference only

## How to compile and run using command line utilities
```
    $   scalac  MyTimer.scala TestTimer.scala
```

To run
```
    $   scala TestTimer
```

##  Quick Testing on Scala Shell
Here is a handy way to test using Scala Shell...

Copy / Paste the Timer code into Scala Shell
```
scala>
    copy paste MyTimer.scala code here
    ...

    defined module MyTimer
```

Now do testing:
```scala
scala>
    MyTimer.timeit { 1 + 2}
```

