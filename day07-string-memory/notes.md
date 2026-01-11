# Day 8 – String Memory & Immutability

## What I learned today:

Today I learned how Java stores Strings in memory.

---

## 🔹 String Pool
String Pool is a special memory area where Java stores String literals.
If the same String value already exists, Java reuses it.

This helps to save memory.

---

## 🔹 Heap Memory
When we create String using `new` keyword,
Java always creates a new object in Heap memory.

---

## 🔹 == vs equals()
- `==` checks memory location
- `equals()` checks text value

---

## 🔹 String Immutability
String is immutable, which means it cannot be changed.
Whenever we modify a String, a new object is created.

---

## 🧠 Real Life Example
Like a printed book:
If you want to change a sentence,
you must print a new book.

---

## ✔ Summary
Today I understood how Java stores Strings.
I also understood why Strings are immutable and how memory is saved.
