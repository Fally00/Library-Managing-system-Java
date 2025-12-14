📚 Library Managing System — Java

A Java-powered library management app — currently a WIP but totally worth documenting!
This project is meant to simulate a simple library system with basic operations like adding/viewing books, issuing & returning, searching, and even calculating fines. Not fully functioning yet, but it’s beginner-friendly and a great learning base for full-on library apps.

🚀 Project Overview

This repo contains multiple Java classes that together represent different bits of a library system:

✨ Core features planned / in-progress
✔ Add books
✔ Search for books
✔ Borrow & return books
✔ Calculate overdue fines
✔ User roles (admin & common user)

💡 The system uses simple file I/O and modular classes to structure operations.
🧠 No GUI yet (console-based interaction only).

Right now the project compiles and shows the class layout — it needs a main entry point and wiring logic so it works end-to-end.
```
🗂 Repo Structure
Library-Managing-system-Java/
├── AddBook.java
├── Admin.java
├── Book.java
├── BorrowBooks.java
├── CalculateFine.java
├── CommonUser.java
├── DataBase.java
├── DeleteBook.java
├── PlaceOrder.java
├── ReturnBook.java
├── Search.java
├── ViewBooks.java
├── ViewOrders.java
├── User.java
├── LICENSE
├── .gitignore
└── …

Each class handles one part of the system logic, e.g., Search.java for searching and BorrowBooks.java for borrowing. 
GitHub
```
🧠 Current Status

🚧 Work In Progress!
This is not yet a full product — some functionality is stubbed out, methods need completing, and there’s no single point of entry (main() method) that ties everything together.

What still needs work

Create a Main.java with menu system

Connect classes into a real workflow

Save state to a file or database

Unit tests
```
💻 How to Build & Run (Dev)

If you want to check the code locally:

Prerequisites

Java JDK 8+ installed

Your favorite IDE or terminal (VS Code, IntelliJ, NetBeans, etc.)

Steps

Clone this repo

git clone https://github.com/Fally00/Library-Managing-system-Java.git
cd Library-Managing-system-Java


Open in IDE
Load the folder in your IDE so you can browse packages, compile, and run code.

Compile from CLI

javac *.java

```
Run
```
Since there's no run file yet, you’ll need to create a Main.java file that calls other classes.
```
🧪 Example Tasks (Dev Goals)

If you’re chaining features together later, here’s what a quick interaction might look like:

Welcome to Library Manager!
1) Add Book
2) View All Books
3) Borrow Book
4) Return Book
5) Search Book
6) Calculate Fine
Select: _


Then the program runs based on user choice.
```
🛠 Tech Stack
Tool	Purpose
Java	Core language 🧠
JVM	Runtime environment
File I/O	Temporary data handling
```
