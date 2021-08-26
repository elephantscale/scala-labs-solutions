<link rel='stylesheet' href='../assets/css/main.css'/>

# Lab 18 Akka: Akka Actors Quickstart with Scala

### Overview
Run a Akka quickstart, analyze it

### Depends On
None

### Run time
30 mins

## Step 1

Enter ./sbt on OSX/Linux or sbt.bat on Windows to start sbt.

## Step 2

At the sbt prompt, enter reStart.

sbt builds the project and runs Hello World

## What Hello World does
* The example consists of three actors:

* Greet: Receives commands to Greet someone and responds with a Greeted to confirm the greeting has taken place
* GreeterBot: receives the reply from the Greeter and sends a number of additional greeting messages and collect the replies until a given max number of messages have been reached.
* GreeterMain: The guardian actor that bootstraps everything

## Benefits of using the Actor Model

* The following characteristics of Akka allow you to solve difficult concurrency and scalability challenges in an intuitive way:

* Event-driven model — Actors perform work in response to messages. Communication between Actors is asynchronous, allowing Actors to send messages and continue their own work without blocking to wait for a reply.
* Strong isolation principles — Unlike regular objects in Scala, an Actor does not have a public API in terms of methods that you can invoke. Instead, its public API is defined through messages that the actor handles. This prevents any sharing of state between Actors; the only way to observe another actor’s state is by sending it a message asking for it.
* Location transparency — The system constructs Actors from a factory and returns references to the instances. Because location doesn’t matter, Actor instances can start, stop, move, and restart to scale up and down as well as recover from unexpected failures.
* Lightweight — Each instance consumes only a few hundred bytes, which realistically allows millions of concurrent Actors to exist in a single application.