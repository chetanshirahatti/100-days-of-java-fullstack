# 🔎 Java Streams Deep Explanation — Day 28

This document explains Streams in a deep and simple way for future revision and for visitors reading this repository.

---

# 🧠 What is a Stream?

A Stream is a pipeline used to process data from a collection.

Important:
Streams do NOT store data.
They only transform or filter data.

---

# ⚙️ Stream Pipeline

Source → Intermediate Operations → Terminal Operation

Example:

List → filter → map → collect

---

# 🔑 Types of Operations

## Intermediate Operations

* filter()
* map()
* sorted()
* distinct()

These are lazy and do not execute immediately.

## Terminal Operations

* forEach()
* collect()
* reduce()
* count()

Terminal operation triggers execution.

---

# 🔥 Lazy Execution

Streams execute only when a terminal operation is called.

This improves performance because Java can optimise the pipeline internally.

---

# 🧩 filter()

Used to select elements based on condition.

Example idea:
Select users with active status.

---

# 🧩 map()

Used to transform data.

Example idea:
Convert names to uppercase.

---

# 🧩 reduce()

Used to combine values into a single result.

Example:
Calculate total salary.

---

# 🧠 Internal Iteration

Streams use internal iteration.
Java controls traversal instead of developer writing loops.

This allows:

* Cleaner code
* Parallel execution
* Better performance.

---

# ⚡ Real Backend Usage

Streams are used in:

* REST API data processing
* DTO mapping
* Database filtering
* Functional pipelines

Example patterns:

list.stream().filter().map().collect()

---

# 🏁 Summary

Streams provide a modern functional way to process data.
They make backend code readable, maintainable, and scalable.
