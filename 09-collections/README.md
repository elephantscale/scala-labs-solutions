<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections

Login to your node, instructor will provide details.

Fire up scala by typing   
    $  scala

Try these in scala prompt

```scala
> val x = 1 to 10
> val  x2 = x.map(a => a*2)   
// question : did map operation change the value of X?
// question : can you come with a shorthand version
```

```scala
// calculate the squares of X
> val  xsq = x.map( ???)
// can you do a short-hand version for squares
// Hint : Math.pow()
```

```scala
> val even = x.filter ( a =>   a%2 == 0)  
// try a shorter version
```

```scala
// add up all even numbers
> even.reduce( (a,b) => a+b)  
// try the shorter version
```

```scala
// do this in one line:  add up all even numbers in X
Hint:  x.filter().reduce()
// also try the short hand version
```
