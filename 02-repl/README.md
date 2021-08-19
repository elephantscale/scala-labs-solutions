<link rel='stylesheet' href='../assets/css/main.css'/>

[<< back to main index](../README.md)

---

# Lab 2.1 : Scala REPL

### Overview
Play with Scala REPL environment

### Depends On
None

### Run time
10 mins

## Instructions To Instructor
**Please go through this lab on 'screen' first.**

## Notes
The REPL environment can be run either
1. Command line
2. Within a IDE

We will try both.

## Step 1 : Login to your VM
If you are using a remote VM

## Step 2 : Start a terminal  Window
Make sure `scala`  command is in your PATH.

## Step 3 : Start Scala REPL
```bash
    $  scala

```

You will see Scala shell as follows.

```console
Welcome to Scala 2.13.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_161).
Type in expressions for evaluation. Or try :help.

scala>
```

## Step 4 : Try the following REPL commands

```scala

scala>
    1 + 1

    println("hello world")

    :help

```

## Step 5 : Tab completion
Experiment with TAB completion.   

Hint : Hit the TAB key after the dot (.)

Hint : Also try double-TAB

```scala
scala>
    "hello world".[TAB key]

    "hello world".toU[TAB key]

    "hello world".toUpperCase
    res3: String = HELLO WORLD
```

## Step 6 : Experiment with REPL
Try a few commands

```scala

scala>
    for (i <- 1 to 10)
        println(i)
```

## REPL in UI
We will show how to run REPL environment in Intellij IDE.

## Step 7 : Start IntelliJ IDE

### Instructor
Please make sure all students have IntelliJ up and running

## Step 8 : Create a Project
Make the following choices:
- File --> New Project
- Choose Scala project and select SBT
- Project definitions
    - Name your project 'hello'
    - Set the project directory
    - accept SBT and Scala versions

## Step 9: Run SBT Console

- Click on 'Run --> Edit Configurations'
- Create a new Scala runtime

## Step 10: Try the same REPL exercises
