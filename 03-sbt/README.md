<link rel='stylesheet' href='../assets/css/main.css'/>

# Lab 3 : SBT Intro

### Overview
Get to know SBT

### Depends On
None

### Run time
10 mins

## Step 1 : Go to 03-sbt dir
The directory `scala-labs/03-sbt`  has a minimal project to test SBT

```bash
    cd ~/scala-labs/03-sbt
```

## Step 2 : Inspect build.sbt
We have a minimal [build.sbt](build.sbt) here that looks likes this

```scala
name := "HelloApp"

version := "1.0"

scalaVersion := "2.13.3"

```

## Step 3 : Inspect source code
[src/main/scala/example/Hello.scala](src/main/scala/example/Hello.scala) is our src file.  
It is our 'Hello world' program  

```scala
package example

object Hello extends  App {
  println("hello world")
}
```

## Step 4 : Compile the project
```bash
    $   sbt compile
```

The first time you run SBT compile, it will download a bunch of dependencies.

Look for success message as follows
```console
[success] Total time: 2 s, completed
```

## Step 6 : Run the project

```scala
    $   sbt run
```

Watch for output like
```console
[info] Running example.Hello
hello world
[success] Total time: 1 s, completed Feb 4, 2018 6:39:23 PM
```

## Step 7 : Edit / Compile / Run
Using your editor of choice edit file [src/main/scala/example/Hello.scala](src/main/scala/example/Hello.scala).  

Change the greeting to : **hello Scala world**

Save the file.

Compile and run again

```bash
    $  sbt compile

    $  sbt run
```

## Step 8 : SBT Shell
In one terminal, start SBT shell

```bash
    $   cd  ~/scala-labs/03-sbt

    $   sbt
```

Now you will be in the sbt shell as follows.  
```console
    sbt:HelloApp>
```

**Leave this terminal as it is.  Do not terminate**

## Step 9 : Execute some commands in SBT shell
Try the following commands

```scala
    >  compile
    >  run
```

**Note how quick the commands are executed!**

```console
sbt:HelloApp> compile
[success] Total time: 1 s, completed Feb 4, 2018 6:53:08 PM
sbt:HelloApp> run
[info] Running example.Hello
hello scala world
[success] Total time: 0 s, completed Feb 4, 2018 6:53:10 PM
sbt:HelloApp>
```

## Step 10 : Edit / Compile / Run

Using your editor of choice edit file [src/main/scala/example/Hello.scala](src/main/scala/example/Hello.scala).  

Change the greeting to something else : **hello SBT world**

Save the file.

In the SBT shell window try these

```scala
    >  compile
    >  run
    >  runMain example.Hello
```

## Step 11 : Continuous Mode

In SBT shell start a continuous compile

Pay attention to the ~ (tilde) at the start

```scala

    >  ~compile
```

Using your editor of choice edit file [src/main/scala/example/Hello.scala](src/main/scala/example/Hello.scala).   

Make some changes (change the greeting ..etc)

Save the file

As you save the file watch the SBT window!  
As soon as the file is saved, SBT it automatically compile the code !!

Also make some syntax error (for example make a typo in println)  and save and watch the output.

**Hit enter to exit continuous mode**

## Step 12 : Package the project for 'deployment'
```bash
    $  sbt package
```

or in SBT shell
```scala
    >  package
```

It will create a jar file in 'target/scala-x-y-z' directory.

```console
target/scala-2.13/helloapp_2.13-1.0.jar   [size 3k]
```

We can run this jar file using `scala`

```bash
    $  scala  target/scala-2.13/helloapp_2.13-1.0.jar

    $  scala  target/scala-2.13/helloapp_2.13-1.0.jar  example.Hello

```



## Optional Bonus Stuff

## Useful SBT commands

### To create a new project from a standard template

```bash
    $ sbt new sbt/scala-seed.g8
    ....
    Minimum Scala build.

    name [My Something Project]: hello

    Template applied in ./hello
```

