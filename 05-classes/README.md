<link rel='stylesheet' href='../assets/css/main.css'/>

[<< back to main index](../README.md)

---

# Lab 5: Classes

In this section, we will learn how to define classes in Scala.

We will define simple shapes.

## Step 1 - Start with Triangle

Take a look at the `Triangle` class.

Run the `Main` class, where we initialize a `Triangle` and print out.

## Step 2 - Refactor

Move the classes into a package `shape`

## Step 3 - Auxilary Constructor

Add a new auxilary constructor to `Triangle`.

This one takes only one INT argument (all sides are of equal length).  Here is the code:

```scala
class Triangle (a: Int, b: Int, c:Int ) {

    def this (size: Int) = {
        this (size, size, size)
    }
}
```