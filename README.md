ICE TASK 6 INTRODUCTION TO MOBILE APPLICATION DEVELOPMENT

ST10460535

Name: Tashinga Surname: Mupandawana

<u>1 .Purpose</u>

The purpose of this application is both education and entertainment. It
educates the user on how to be more responsible. It does this by giving
a situation were you are encouraged to take care of a pet. You will
learn that responsibility means being present, alert and responsive.
This application entertains the user by the different colors, by the
different ways that the user can interact with the interface and by
giving the user an exciting experience. This occupies the users time and
gives them something to be happy for.

<u>2. Design considerations</u>

The name of my application will be: My Virtual Pet App

The picture of my pet that will appear on the welcome screen:

<img src="media/image1.jpeg" style="width:4.375in;height:3.71957in" alt="Why Is TikTok Obsessed With the Kids&#39; TV Show &#39;Bluey&#39;?" />

Welcome screen:

<img src="media/image2.png" style="width:4.46875in;height:7.88542in" alt="A screenshot of a cartoon Description automatically generated" />

There is one button that will lead you to the other pages.

<img src="media/image3.png" style="width:6.24045in;height:5.21948in" alt="A screenshot of a phone Description automatically generated" />

The second page:

<img src="media/image4.png" style="width:3.02083in;height:5.19792in" />

The happiest textView will change to a different text that indicates
that the play button needs to be pressed since the pet is no longer so
happy.

<img src="media/image5.png" style="width:6.26806in;height:5.4625in" alt="A screenshot of a video game Description automatically generated" />

When the user clicks the Play button the picture should change to the
one that shows the dog playing just like in the following picture.

<img src="media/image6.png" style="width:6.26806in;height:5.20625in" alt="A screenshot of a video game Description automatically generated" />

The textView for Cleanliness will change to a different text that
indicates that the Bath button needs to be pressed since the pet is no
longer clean.

When the user clicks on the Bath button the picture should change to the
one that shows the dog in the bathtub just like in the following
picture.

<img src="media/image7.png" style="width:6.26806in;height:5.16458in" />

The Hunger textView will now change to a different text that will
indicate that the Feed button needs to be pressed since the pet is now
hungry.

When the Feed button is pressed the picture should change to the first
picture that comes after the welcome screen which is the one with the
pet eating.

1.  **<u>General design</u>**

The applicationâ€™s target group is children. This will mean that it will
need to cause interest and excitement. Firstly it will interest the user
by the bright and eye catching colors I used for the design. There are
various elements with different colors. I used different colors for the
welcome page and the pages that follow. I used different colors for
different words and buttons. The application then courses excitement
with the many ways that the user will notice that they can play with
their pet. Interaction is the key connection between the user and the
application.

1.  **<u>Intuitive design</u>**

Everything in my application can be read from left to right and top to
bottom as users would expect. I did not place user interface elements in
confusing locations. I placed multiple textViews in rows and multiple
buttons in rows that correlate to avoid confusing the user. I as well
placed each button that correlates to a certain task close to it. The
Hunger textViews is next to the Feed button, The Happiness textViews is
next to the Play button, and Cleanliness textViews is next to the Bath
button.

1.  **<u>Content prioritization</u>**

I only used UI elements that the user needs. I used the necessary number
of TextViews for the necessary information that is needed and the
necessary number of buttons for the necessary number of actions that
need to be carried out. The amount of information that I gave was not
overwhelming. The text is of a length that does not lack detail nor make
the reader tired.

1.  **<u>Legible Text Content</u>**

The font that I used is plain and simple as it is not overly stylish as
compared to other fonts that might confuse the reader. I used a font
that does not screw words or join place letters close to each other. The
size of the text is big enough to be visible and small enough to be
taken seriously.

1.  **<u>Make Interface Elements Clearly Visible</u>**

The interface elements are clearly visible. They do not obstruct each
other by being above each other even slightly. There is enough space
between element so that the user can see as well as click what they want
without confusing it with something else. The elements are also not
overly spaced as to reduce the useful effect of correlation.

1.  **<u>Hand Position Controls</u>**

The buttons are placed within a closer distance to the lower part of the
screen as compared to the higher part of the screen. This will be useful
as the users hands are usually closer to the lower part of the screen.
This will make it easier for the user to use the controls.

1.  **<u>Images</u>**

I chose these specific images because in combination they serve the role
of a virtual pet. They are colorful and capture the users imagination.
They are likely to invoke interest from the user.

**<u>3.GitHub and GitHub Actions</u>**

Version Control with GitHub

//Steps 1 to 4 must be done in GitHub and Android Studio.

//The content in this document must be added in the Report under 3.
GitHub and GitHub actions

//Under Testing and Automated testing copy the text as is and paste in
the report â€“ only change the unit test code to be your own code â€“ only
use 3 of the ages in your code

1\. Create a New GitHub Repository:

Go to the GitHub website (https://github.com/) and sign in to your
account.

Click on the "+" icon in the top right corner and select "New
repository".

Give your repository a name (your student number and name â€“ in one
word), add a description (use IMAD5112 Assignment 1) and choose public.

Click on the "Create repository" button.

2\. Initialise the Repository with a README File:

After creating the repository, you'll see an option to "Initialize this
repository with a README". Check this option to create a README file.

Click on the "Create repository" button to finalize the creation of the
repository.

3\. Commit and Push Your Project Files to the GitHub Repository:

In Android Studio, go to VCS (Version Control System) -> Import into
Version Control -> Share Project on GitHub.

Log in to your GitHub account if prompted, and select the repository you
created earlier.

Click on the "Share" button to push your project files to the GitHub
repository.

4\. Regularly Commit and Push Your Code as You Make Progress:

After the initial push, continue making changes to your project in
Android Studio.

Whenever you make significant progress or changes, commit your changes
locally in Android Studio using VCS -> Commit Changes.

Once committed, push your changes to the GitHub repository using VCS ->
Git -> Push.

Testing and Automated Testing:

1\. Conduct Manual Testing:

Manually test your app to ensure it functions seamlessly and offers an
enjoyable educational experience for learners.

To test various features and user interactions do the following:

1\. Create a New Test Class:

In your Android project, navigate to the tests directory (or create it
if it doesn't exist).

Create a new Kotlin file for your test class. Name it appropriately to
indicate what component or functionality you are testing.

2\. Write Test Methods:

Inside the test class, write test methods like the example below.

3\. Use assertions to verify the expected behaviour of your code.

4\. Run the Tests:

Run the tests using the testing framework's tools provided by Android
Studio or through the command line.

Sample of a test class using JUnit:

import org.junit.Assert.\*

import org.junit.Test

class MyUnitTest {

@Test

fun testWhenStatement() {

// Test case for a when statement

val result = when (25) {

21 -> "Some Body, famous for â€¦, died at this age" // use your own
wording (copy from your code) â€“ only need 3 ages from your code for the
test here.

34 -> "Another Some Body, famous for â€¦â€¦., died at this age"

63 -> "Someone Else, famous for â€¦..., died at this age"

else -> "Nobody famous known to me died at this age"

}

assertEquals("Nobody famous known to me died at this age", result)

}

}

2\. GitHub Actions for Automated Testing:

Set up GitHub Actions to automatically run tests and build your code
whenever changes are pushed to the repository.

Create a GitHub Actions workflow (.github/workflows/tests.yml) to run
tests automatically on every push:

Create a .github/workflows directory in your project repository.

Inside this directory, create YAML files defining your GitHub Actions
workflows for testing and building.

Sample GitHub Actions Workflow for Testing (tests.yml):

name: Run Tests

on: \[push\]

jobs:

test:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build and test

run: ./gradlew test

Set Up Automated Build:

Create a GitHub Actions workflow (.github/workflows/build.yml) to build
the APK automatically on every push.

Sample GitHub Actions Workflow for Building (build.yml):

name: Build APK

on: \[push\]

jobs:

build:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

Rwith:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build APK

run: ./gradlew assembleDebug

Test your workflows by pushing changes to your repository and observing
the actions running in the "Actions" tab on GitHub.

**<u>\*LINK TO MY GITHUB:</u>**

https://github.com/Mupand/My-Virtual-Pet-App

**<u>4.Link To YouTube Video</u>**

https://youtu.be/tTxPllcTot8?si=rtE\_3kv\_Tcfcl4dx

**<u>5.Code</u>**

-   **<u>Sample Code</u>**

> //Assignment 2 Basic solution
>
> MainActivity:
>
> Import android.content.Intent
>
> Import androidx.appcompat.app.AppCompatActivity
>
> Import android.os.Bundle
>
> Import android.widget.Button
>
> Class MainActivity : AppCompatActivity() {
>
> Override fun onCreate(savedInstanceState: Bundle?) {
>
> Super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity\_main)
>
> // Button to navigate to the second screen
>
> Val startButton = findViewById&lt;Button>(R.id.startButton)
>
> startButton.setOnClickListener {
>
> val intent = Intent(this, GameActivity::class.java)// GameActivity:
> name of the second activity
>
> // Pass the message â€œI am hungryâ€ as an extra with the intent
>
> Intent.putExtra(â€œFEED\_MESSAGEâ€, â€œI am hungryâ€)//This will be shown in
> the feedTextView
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> GameActivity:
>
> Class GameActivity : AppCompatActivity() {
>
> Override fun onCreate(savedInstanceState: Bundle?) {
>
> Super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity\_game)
>
> val petImageView = findViewById&lt;ImageView>(R.id.petImageView)
>
> val feedButton = findViewById&lt;Button>(R.id.feedButton)
>
> val cleanButton = findViewById&lt;Button>(R.id.cleanButton)
>
> val playButton = findViewById&lt;Button>(R.id.playButton)
>
> val feedTextView = findViewById&lt;TextView>(R.id.feedTextView)
>
> val cleanTextView = findViewById&lt;TextView>(R.id.cleanTextView)
>
> val playTextView = findViewById&lt;TextView>(R.id.playTextView)
>
> // Retrieve the message passed from the first screen
>
> Val feedMessage = intent.getStringExtra(â€œFEED\_MESSAGEâ€)
>
> // Set the text of the feed TextView to the feed message
>
> feedTextView.text = feedMessage
>
> // Logic for the Feed button
>
> feedButton.setOnClickListener {
>
> // Change the petâ€™s image to match feeding action icon
>
> petImageView.setImageResource(R.drawable.pet\_image\_feeding)//replace
> text in bold with your picture name
>
> // Update the petâ€™s status values (e.g., health, hunger, cleanliness)
>
> // Update the feed TextView
>
> feedTextView.text = getString(R.string.feed\_thank\_you)
>
> // Update the play TextView
>
> playTextView.text = getString(R.string.play\_with\_me)
>
> }
>
> // Logic for the Clean button
>
> cleanButton.setOnClickListener {
>
> // Change the petâ€™s image to match cleaning action icon
>
> petImageView.setImageResource(R.drawable.pet\_image\_cleaning)//your
> picture name here
>
> // Update the petâ€™s status values (e.g., health, hunger, cleanliness)
>
> // Update the clean textview
>
> cleanTextView.text = getString(R.string.clean\_nice\_and\_clean)
>
> }
>
> // Logic for the Play button
>
> playButton.setOnClickListener {
>
> // Change the petâ€™s image to match playing action icon
>
> petImageView.setImageResource(R.drawable.pet\_image\_playing)//your
> picture name here
>
> // Update the petâ€™s status values (e.g., health, hunger, cleanliness)
>
> // Update the play TextView
>
> playTextView.text = getString(R.string.play\_that\_was\_fun)
>
> // Update the clean textview
>
> cleanTextView.text = getString(R.string.clean\_after\_playing)
>
> }
>
> }
>
> }
>
> For good programming practice, text has to be added to the strings.xml
> file. Example:
>
> &lt;!â€”strings.xml
>
> &lt;resources>
>
> &lt;!â€”Feed Button Text
>
> &lt;string name=â€feed\_button\_textâ€>Feed&lt;/string>
>
> &lt;!â€”Feed Message
>
> &lt;string name=â€feed\_messageâ€>Thank you, I have eaten
> enough!&lt;/string>
>
> &lt;!â€”Play Button Text
>
> &lt;string name=â€play\_button\_textâ€>Play&lt;/string>
>
> &lt;!â€”Play Message
>
> &lt;string name=â€play\_messageâ€>Please play with me!&lt;/string>
>
> &lt;!â€”Clean Button Text
>
> &lt;string name=â€clean\_button\_textâ€>Clean&lt;/string>
>
> &lt;!â€”Clean Message
>
> &lt;string name=â€clean\_messageâ€>All this playing made me dirty.
> Please wash me?&lt;/string>
>
> &lt;!â€”Cleaned Message
>
> &lt;string name=â€cleaned\_messageâ€>Nice and clean, I am going to take
> a nap now. See you later!&lt;/string>
>
> &lt;/resources>

-   <u>My code</u>

> MainActivity.kt:
>
> Kotlin
>
> Import android.content.Intent
>
> Import androidx.appcompat.app.AppCompatActivity
>
> Import android.os.Bundle
>
> Import android.widget.Button
>
> Class MainActivity : AppCompatActivity() {
>
> Override fun onCreate(savedInstanceState: Bundle?) {
>
> Super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity\_main)
>
> // Button to navigate to the second screen
>
> Val startButton = findViewById&lt;Button>(R.id.startButton)
>
> startButton.setOnClickListener {
>
> val intent = Intent(this, SecondActivity::class.java)
>
> // Pass the message â€œI am hungryâ€ as an extra with the intent
>
> Intent.putExtra(â€œFEED\_MESSAGEâ€, getString(R.string.feed\_message))
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> SecondActivity.kt:
>
> Kotlin
>
> Import android.content.Intent
>
> Import android.os.Bundle
>
> Import androidx.appcompat.app.AppCompatActivity
>
> Import android.widget.Button
>
> Import android.widget.TextView
>
> Class SecondActivity : AppCompatActivity() {
>
> Override fun onCreate(savedInstanceState: Bundle?) {
>
> Super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity\_second)
>
> val feedButton = findViewById&lt;Button>(R.id.feedButton)
>
> val feedTextView = findViewById&lt;TextView>(R.id.playTextView2nd)
>
> val feedMessage = intent.getStringExtra(â€œFEED\_MESSAGEâ€)
>
> feedTextView.text = feedMessage
>
> feedButton.setOnClickListener {
>
> val intent = Intent(this, ThirdActivity::class.java)
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> ThirdActivity.kt:
>
> Kotlin
>
> Import android.content.Intent
>
> Import android.os.Bundle
>
> Import androidx.appcompat.app.AppCompatActivity
>
> Import android.widget.Button
>
> Import android.widget.TextView
>
> Class ThirdActivity : AppCompatActivity() {
>
> Override fun onCreate(savedInstanceState: Bundle?) {
>
> Super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity\_third)
>
> val cleanButton = findViewById&lt;Button>(R.id.cleanButton)
>
> val cleanTextView = findViewById&lt;TextView>(R.id.cleanTextView3rd)
>
> cleanButton.setOnClickListener {
>
> val intent = Intent(this, FourthActivity::class.java)
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> FourthActivity.kt:
>
> Kotlin
>
> Import android.content.Intent
>
> Import android.os.Bundle
>
> Import androidx.appcompat.app.AppCompatActivity
>
> Import android.widget.Button
>
> Import android.widget.TextView
>
> Class FourthActivity : AppCompatActivity() {
>
> Override fun onCreate(savedInstanceState: Bundle?) {
>
> Super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity\_fourth)
>
> val feedButton = findViewById&lt;Button>(R.id.feedButton)
>
> val feedTextView = findViewById&lt;TextView>(R.id.feedTextView4th)
>
> feedButton.setOnClickListener {
>
> val intent = Intent(this, SecondActivity::class.java)
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> //(Open AI, 2024)

**<u>6.Reference List</u>**

[Andy Dyson](https://www.levelwinner.com/author/andy/)Â . Posted onLast
updated:Â March 22, 2018. Levelwinner. Available at:
<https://www.levelwinner.com/my-tamagotchi-forever-ultimate-guide-tips-cheats-hints-master-game/>
\[Accessed 19 April 2024\]

[Brinton Parker](https://www.popsugar.com/author/brinton-parker)**.**
Updated on 5/1/2015 at 3:47 PM. PopSugar. Available at:
<https://www.popsugar.com/tech/tamagotchi-apple-watch-app-37391768>
\[Accessed 19 April 2024\]

Disneyclips. 2024. \[Online\]. Available at:
https://www.disneyclips.com/images3/bluey.html#google\_vignette
\[Accessed 19 April 2024\]

OpenAI. 2024. Chat-GPT (Version 3.5). \[Large language model\].
Available at:
[<u>https://chat.openai.com/</u>](https://chat.openai.com/) \[Accessed:
25 April 2024\].

Reddit. 2024. \[Online\].Available at:
<https://www.reddit.com/r/bluey/comments/vgbuxn/as_a_veterinarian_this_episode_gives_me_so_much/>
\[Accessed 19 April 2024\]

The Independent Institute of Education. 2024. Introduction To Mobile
Application Development IMAD5112/D/P/W Module Manual 2024. IIE Varsity
College \[eBOOK\]. Available on VC learn at:
[<u>https://advtechonline.sharepoint.com/:f:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112?csf=1&web=1&e=jJYmVN</u>](https://advtechonline.sharepoint.com/:f:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112?csf=1&web=1&e=jJYmVN)
\[Accessed: 25 April 2024\].
