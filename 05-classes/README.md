<link rel='stylesheet' href='../assets/css/main.css'/>

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

## Step 4 - Create a new class `Square`

This will only take one parameter: `size`

Create appropriate `toString` method

Also create a function `getSize` that returns the size attribute