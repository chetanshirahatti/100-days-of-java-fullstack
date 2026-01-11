## What I learned today:

Today I learned why we should not use String for heavy modification.

---

## 🔹 Problem with String
String is immutable.
Every modification creates a new object.
This reduces performance.

---

## 🔹 StringBuilder
StringBuilder is mutable.
It modifies the same object.
It is fast and memory efficient.

---

## 🔹 StringBuffer
StringBuffer is also mutable.
It is thread-safe.
It is slower than StringBuilder.



## 🔹 Which one to use?
- Normal programs → StringBuilder
- Multi-thread programs → StringBuffer

---

## 🧠 Real Life Example
String → Printed book (cannot change)  
StringBuilder → Whiteboard (can edit)  
StringBuffer → Whiteboard with lock (safe for many users)

---

## ✔ Summary
Today I understood the performance issue with String.
I learned how StringBuilder and StringBuffer solve it.