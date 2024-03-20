# icode

Base project for FDM 2024 mini bootcamp

## Let's get ready for the bootcamp!

Follow along with this tutorial to ensure your machine is configured and ready to go for the upcoming March 20th bootcamp!

- [ ] Create GitHub account
- If your GitHub email does not match the email you used to register, please respond back to the acceptance email with your GitHub account email.
- [ ] Download necessary technology
- [ ] Complete [Tutorial](#tutorial)

Meet other [participants](#participants)!

## Downloads

- [Download Java](#download-java)
- [Download Git](#download-git)
- [Download Codespace](#download-code-ide)

## Download Java

In order to create and run java programs, you will need to ensure you have Java available on your device.
<br /> Since the project is built using Java 17, ensure the version you download is equivalent or newer (17+)
<br/> [Click here to download](https://www.oracle.com/java/technologies/downloads/#java17)

## Download Git

Git is a open-source version control technology that allows developers to share code quickly and efficiently.
<br /> The latest version of Git is 2.43.0 -- it is recommended to have at least version 2.23
<br /> [Click here to download](https://git-scm.com/)

## Download Code IDE

Code Integrated Development environments (IDE) are applications that assist developers code efficiently. They often assist with identifying syntactical and compilation errors and provide suggestions on how to work towards a resolution. There are several open-source options on the market and you are encouraged to find the one that best suits your needs.
<br /> **Recommended IDEs**
<br /> [Eclipse IDE](https://www.eclipse.org/downloads/)
<br /> This is an IDE tailored towards Java Developers and is a preferred workspace at FDM.
<br /> [VS Code](https://code.visualstudio.com/download)
<br /> This is a great alternative and supports several languages and extensions.

## Tutorial

After completing this brief tutorial, you will have a basic understanding of git necessary for the upcoming bootcamp.

Step 1: On your account create a project
<br /> > Navigate to your profile
<br /> > Select the 'Repositories' tab
<br /> > Select 'New'
<br /> > Name the repository 'introduction'
<br /> > You can add a description (optional)
<br /> > Ensure it is public
<br /> > Select 'Create Repository'

Step 2: Clone project to your device > GitHub provides commands that you can follow along with

Step 3: Add a small introduction about yourself to your README.md and push the changes to the main branch
<br /> How to push to repositories

    ```
    git add .
    ```

> This will add everything in your folder to the repository

    ```
    git add READ.md
    ```

> This will only add the READ.md.
> When you 'add' items, those items are 'staged' and ready to be committed and pushed to the origin (GitHub).

Check that the correct files are added
`
	git status
	`

> After you run git status, you can ensure only desired files are staged and have the opporunity to unstage any unnecessary files

    ```
    git restore --staged <file>
    git commit -m "introduction added"
    git push
    ```

Step 4: Create a new branch called "branched"

    ```
    git switch -c branched

    ```

> Or

    ```
    git checkout branched

    ```

> Add a new text file to the branch

    ```
    touch experience.txt
    ```

> Inside the text file, tell us a little bit about your experience with Java.
> Push introduction to new branch.

Step 5: Fork icode project to your machine

> On the top right corner of this repository, Click 'Fork', this will fork the repository to your profile.
> <img src="https://github.com/audreypuckett/icode/blob/main/tutorial-images/available-on-profile.png"><br />
> Clone the newly forked repository to your machine
> <br /> In the README.md file, under 'Participants' add the link to your newly created introduction repository
> <br /> > \[Your Full Name](http://link) -- Your Full Name should match the name you used to register for this event.
> <br /> Push changes with your name as the commit message <br/> > <img src="https://github.com/audreypuckett/icode/blob/main/tutorial-images/clone-forked.png"><br />
> Create a new pull request for the original repository to accept
> <img src="https://github.com/audreypuckett/icode/blob/main/tutorial-images/complete-tutorial.png"><br />
> Add descriptive comment and complete request by clicking 'Create pull request'
> <img src="https://github.com/audreypuckett/icode/blob/main/tutorial-images/merge-request.png"><br />

Done! You are set to go!

## Participants

[Audrey Puckett](https://github.com/audreypuckett/introduction)

> [Michael Eshun](https://github.com/meshun074/Introduction.git) 
<br /> [Julie Cheng](https://github.com/jucheng925/introduction) 
<br /> [Chao Meng](https://github.com/Chao-Meng/introduction)
<br /> [Diya Patel](https://github.com/42diyapatel/introduction)
<br /> [Deepthi Sudhakaran](https://github.com/deepthi-sud/Introduction)
<br /> [Christian Tchoutang](https://github.com/ChristDave/introduction)
<br /> [Yuanyuan Chen](https://github.com/Zeitgeist531/introduction)
<br/> [Johnny Wu](https://github.com/MemeEngineer/Introduction)
<br /> [Zavier Paulino](https://github.com/Zp1021/Introduction)
 <br /> [Kai-Yin Huang](https://github.com/katehuangishere/introduction)
<br /> [Jarin Tasnim](https://github.com/JTasnim24/introduction)
<br /> [Becca Jonas](https://github.com/beccajonas/introduction)
<br /> [Martin Brejniak](https://github.com/Martin-Brejniak/introduction)
<br /> [Saachi Dinesh Kotadia]( https://github.com/Saachi-Kotadia/Introduction.git)
<br /> [Joseph Szpigiel](https://github.com/JosephSzpigiel/introduction)
> <br /> [Maria Davis](https://github.com/Davassy/Introduction1.git)
> <br /> [Fritz Guerilus](https://github.com/mrfritzg/introduction)
> <br /> [Delara Amiri](https://github.com/delmayara/introduction)
> <br /> [Sherin Tharakan](https://github.com/Sherinjtharakan/Introduction)
> <br /> [Brianna Hayes](https://github.com/briannahayes/introduction)
> <br /> [Max Zhang](https://github.com/maxzhangg/introduction)
< <br/> [Soumya Khera] (https://github.com/soumya-khera/Introduction)
<br /> [Alex Mwaura](https://github.com/AlexMwaura/introduction)
