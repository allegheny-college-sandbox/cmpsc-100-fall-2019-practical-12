# CMPSC 100-03 Practical 12
* Assigned: 15 November 2019
* Due: 18 November 2019, though this work _can be finished_ in less than 50 minutes
* Point value: 20 pts

In this practical session, we explore topics including: 

* GitHub and the `git` "branching" system
* Teamwork
* `methods`
* `return` types
* `FileWriter`

## General guidelines for this particular practical session

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## The heist

Though your work on G. Wiz's (**ahem**, I mean Rad Gator Wiz's) behalf allowed him to elude the authorities for a while, eventually they caught on! G. Wiz has now been set back to where he started: a gator wizard with a major penchant for hats and books. As these things don't go away overnight, he's decided to enlist your help to perform a...**BANK HEIST**! He's enlisted your software development team as his co-conspirators.

(I know, I hear you saying "don't do it G. Wiz!" -- but he's a determined gator, and would you turn in your best gator wizard friend?)

(Probably, but that's a conversation for another day.)

The safe at the bank that G. Wiz has chosen works like this:

* Each day, the safe generates a random, three-digit key code. This code is referred to as the key's _core_.
* Somehow, it allows infinite attempts to unlock it (we might want to advise the bank managers otherwise, later)
* When the correct code is entered, the safe opens, and the jackpot/bonanza/contents are revealed

## Required deliverables

Each member of your team must work on one of the following parts indepdent of each other on an indepdenent `branch` in your group's `git` repository (we'll talk about this before starting the activity).

- [ ] a `Key.java` file
- [ ] a method called `pick` in `Lock.java`
- [ ] a method called `crackSafe` in `Safe.java

Once the work is complete, designate one member of your group to be the `master thief`, and call either the professor or TL over to finish and `merge` the various `branches` into one, final attempt at the heist.

### `Key.java`

- [ ] Contains a `public` class called `Key`
- [ ] Contains one instance variable which is a `public final string` called `core``
- [ ] Contains a `constructor` which takes one argument, a `String` called `core`
- [ ] Sets `core` equal to `this` instance's `core` identifier

### `Lock.java`

- [ ] Contains a `method` called `pick` which:
- [ ] Takes one argument, a `Key` object called `key`
- [ ] Returns a `true` or `false`: `true` if `this` instance's `core` identifier equals the `core` of the `key` object passsed to it
- [ ] Otherwise, the `method` should return `false`

### `Safe.java`

- [ ] Contains a `method` called `crackSafe` which:
- [ ] Takes one argument a `Key` object called `key`
- [ ] Sets an instance variabled called `isCracked` to `true` if the `key` passed to `this` instance's `Lock` object's `pick` method returns `true`
- [ ] Otherwise the method should return `false`

### `RunHeist.java`

- [ ] Implements `FileWriter` to write the output of the `Safe` object to find out what was in the safe
- [ ] Writes these contents to a file called `this.bonanza`


## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`