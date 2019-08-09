package com.es 

import akka.actor._

object Main extends App {
  
  override def main(args: Array[String]) {
    val system = ActorSystem("System")
    
    val server = system.actorOf(Props[Server])
    
    val c1 = system.actorOf(Props(new Client("Tim", server)))
    c1 ! Send("Hi, anyone here?")
    
    val c2 = system.actorOf(Props(new Client("Mark", server)))
    val c3 = system.actorOf(Props(new Client("Sujee", server)))
    
    c2 ! Send("Hello")
    
    c3 ! Disconnect
    
  }

}
