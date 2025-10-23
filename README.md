# 📚 Library Management System (Java)

This is a simple Java project that shows how a basic **library system** works.  
It includes features to **add books, issue them to users, return them, and display their status** — all built using core Java and OOP concepts.

---

## 🚀 What This Project Does

- Add new books to the library  
- Issue a book to a user  
- Return a book to the library  
- Display all books along with their current status (Available / Issued)

It’s a great beginner-friendly project to understand how classes and objects work together in Java.

---

## 🧩 Classes Explained

### 🕮 Book
Represents a single book in the library.  
Each book has:
- A title  
- A flag to check if it’s issued or not  

Methods:
- `issue()` → Marks the book as issued  
- `returnBook()` → Marks it as returned  
- `toString()` → Displays book info neatly  

---

### 👤 User
Represents a library user who can borrow books.  
Each user has:
- A name  
- A list of borrowed books  

Methods:
- `borrowBook()` → Adds a book to the user’s borrowed list  
- `returnBook()` → Removes it when returned  

---

### 🏛 Library
Handles everything inside the library —  
adding books, issuing them, and keeping track of what’s available.

Main methods:
- `addBook()`  
- `issueBook()`  
- `returnBook()`  
- `showBooks()`

---

### 🧠 Example Output

