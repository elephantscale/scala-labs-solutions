<link rel='stylesheet' href='../assets/css/main.css'/>

# Types

Here we are looking at the types

## Try this 

This will help us determine the type


```scala
var x = 5  	// Variable  (Integer type)
x = 7          // Change the value 
// Java equivalent: int x = 5;
// question: spot the differences between Java declaration
//           Hint : type declaration (int)  & semicolon

val y = 10	// Constant  (Integer type)
y=11		// error: reassignment to val

var d: Double = 5.0	// Explicit type declaration of Double
// Java equivalent:    double d = 5.0;

// Error-type mismatch. 1.1 is a double, not assignable to Int
val n: Int = 1.1
```

## Now try this:

```scala
scala> val bi: BigInt = 1
bi: BigInt = 1

scala> bi + 2  // Same as bi.+(2)
res14: scala.math.BigInt = 3

scala> 1 to 10  // We'll work with collections and ranges soon
res15: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

```


## Now this:

```scala

val x = 10
val y: Double = 1.3
y = 3.1 // error
var greeting = “hello world”
greeting = “good bye world”  // ok 

val r = 1 to 10
// what is r ?
r(0)
```
