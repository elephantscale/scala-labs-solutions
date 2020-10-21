<link rel='stylesheet' href='../../assets/css/main.css'/>

# JSON Lab

## STEP 1: Look at the current code 

Inspect file: `src/main/scala/x/ClickStream.scala`

Right now, we are parsing a json file into a `Click` case class.

You can run the code like this:

```bash
  sbt "run clickstream.json"
```

You should see the following:

```console
Click(session_36,youtube.com,118,user_9,campaign_19,ip_4,clicked,1420070400000)
Click(session_96,facebook.com,5,user_5,campaign_12,ip_3,blocked,1420070400864)
Click(session_61,sf.craigslist.org,54,user_8,campaign_3,ip_9,clicked,1420070401728)
Click(session_55,wikipedia.org,110,user_6,campaign_18,ip_5,blocked,1420070402592)
```

That's nice, but what do we do with this?

## STEP 2: create a summary report

Now it's your turn

On a Per day basis: Aggregate the following:

1. Clicks per day
2. Blocked Clicks per day
3. Clicks per domain per day
4. Clicks per user per day

You are free to make more classes. In the process.

## Step 3: create unit tests that cover your code

Feel free to make some test cases with either scalatest or specs2 (both are included in build.sbt)

In Intellij, you can run:

  1. Run With Coverage
  2. Analyze -> Show Code Coverage Data

Try to see how high test coverage you can get.
