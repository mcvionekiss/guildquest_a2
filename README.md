GuildQuest – Assignment 2
INF 122 – Implementation for Case Study

Author: Jacey Deng
Date: February 2026


--------------------------------------------------
1. System Requirements
--------------------------------------------------

Java Version:
OpenJDK 17 (tested with Microsoft OpenJDK 17 on macOS)

Operating System:
macOS (Apple Silicon)


--------------------------------------------------
2. How to Run the Program
--------------------------------------------------

Option 1: Run the JAR (Recommended)

1. Open Terminal
2. Navigate to the JAR folder:

   cd out/artifacts/guildquest_jar

3. Run:

   java -jar guildquest.jar


Option 2: Run from IntelliJ

1. Open the project in IntelliJ IDEA
2. Open src/guildquest/Main.java
3. Click the green Run button ▶️


--------------------------------------------------
3. Program Input Instructions
--------------------------------------------------

This program uses a text-based menu system.

At each prompt, type the number or value shown
and press Enter.

Main Menu:

1) Login as existing user
2) Register new user
3) Advance world clock minutes
0) Exit


Example Usage:

1. Login
    - Choose option 1
    - Enter username (e.g., alice)

2. Create a Campaign
    - Go to Campaigns menu
    - Choose "Create campaign"
    - Enter name and visibility (PUBLIC/PRIVATE)

3. Add a Quest Event
    - Select a campaign
    - Choose "Add event"
    - Enter title, time, realm, and visibility

4. View Timeline
    - Choose "Timeline view"
    - Select DAY/WEEK/MONTH/YEAR
    - Enter anchor time (days, hours, minutes)

5. Characters and Inventory
    - Create characters
    - Add/remove items
    - Apply quest rewards to characters

6. Sharing
    - Share private campaigns or events
    - Choose permission type (VIEW_ONLY/COLLABORATIVE)


All inputs are entered through the keyboard
when prompted by the program.


--------------------------------------------------
4. Default Test Accounts
--------------------------------------------------

The system initializes with two users:

Username: alice
Username: bob

These can be used for testing immediately.


--------------------------------------------------
5. Notes and Limitations
--------------------------------------------------

- This is a command-line (CLI) implementation.
- Theme settings are stored but not visually applied.
- Timeline ranges use fixed World Clock units.
- All data is stored in memory and is lost when the program exits.


--------------------------------------------------
6. File Structure
--------------------------------------------------

src/        - Java source files

out/        - Compiled classes and JAR

README.md  - This file
