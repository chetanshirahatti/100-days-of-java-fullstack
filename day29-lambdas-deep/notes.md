# 🔎 Lambda Expressions — Deep Explanation (Day 29)

This document explains **Lambda Expressions** in a deep and simple way for long-term revision and for visitors exploring this repository.

---

# 🧠 Why Lambda Expressions Were Introduced

Before Java 8, implementing behavior required:

* Anonymous inner classes
* Large boilerplate code
* Reduced readability

Java introduced Lambdas to:

* Pass behavior as parameters
* Write cleaner and readable code
* Support functional programming style

---

# 📌 What is a Lambda Expression?

A Lambda Expression is:

* An anonymous function
* A short way to implement a functional interface
* A way to pass logic without method names

General syntax:

```
(parameters) -> expression
```

---

# ⚙️ Functional Interface Requirement

Lambda expressions work only with **functional interfaces**.

A functional interface has:

* Exactly ONE abstract method

Examples:

* Runnable
* Comparator
* Predicate
* Consumer
* Supplier

---

# 🧩 Lambda vs Anonymous Class

Anonymous class:

* Verbose
* Hard to read

Lambda:

* Concise
* Focuses on logic

Lambda removes unnecessary syntax and highlights behavior.

---

# 🔗 Lambda and Streams Relationship

Streams rely heavily on lambda expressions for:

* Filtering data
* Transforming data
* Processing pipelines

Without lambdas, Streams would not be practical.

---

# 🔥 Advantages of Lambda Expressions

* Cleaner code
* Less boilerplate
* Better readability
* Functional programming support

---

# ⚠️ Common Mistakes

* Trying to use lambda with non-functional interfaces
* Expecting performance improvement
* Overusing lambdas where readability suffers

---

# 🏁 Final Summary

Lambda Expressions allow Java developers to:

* Treat behavior as data
* Write concise and expressive code
* Build modern backend applications

Understanding lambdas is essential for Streams, Spring, and modern Java development.
