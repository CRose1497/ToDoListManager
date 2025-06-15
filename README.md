# To-Do List Manager

This is a simple Java console-based To-Do List Manager built for Sprint 1 of my Data Structures and Algorithms course (Semester 4 - Summer 2025).

## ✨ Features

- Create multiple users
- Each user has their own to-do list
- Add tasks to a user's list
- Mark tasks as completed
- View tasks with their status

## 🧱 How It Works

- Users are stored in an `ArrayList`
- Each user's to-do list is implemented as a **singly linked list**
- Menu system runs in the console for interaction

## 📂 Files

- `Task.java` — represents a single task (description + status)
- `TaskList.java` — singly linked list to manage tasks
- `User.java` — holds user info and their TaskList
- `Main.java` — handles the program flow, menus, and user input

## ✅ Requirements Met

- Arrays (`ArrayList`) and singly linked lists used
- Custom linked list implementation
- All expectations from the sprint instructions have been completed

## 📚 How to Run

1. Compile the Java files:

```bash
cd src
javac *.java
java Main

