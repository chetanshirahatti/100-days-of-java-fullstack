
# 🔎 Optional Deep Explanation — Day 30

This document explains the Optional class deeply so that I can revise the concept later and visitors to this repository understand modern Java null handling.

---

# 🧠 Why Optional Was Introduced

NullPointerException was one of the most common runtime errors in Java.

Developers had to manually check for null values everywhere.

Optional was introduced to make null handling explicit and safer.

---

# 📌 What is Optional?

Optional is a container object that may or may not contain a non-null value.

Instead of returning null, methods can return:

Optional<T>

This forces developers to handle missing values properly.

---

# ⚙️ Creating Optional

* Optional.of(value) → value must not be null
* Optional.ofNullable(value) → allows null
* Optional.empty() → empty container

---

# 🔑 Key Methods

## ifPresent()

Executes logic only if value exists.

## orElse()

Returns default value if empty.

## orElseGet()

Lazy version of orElse.

## orElseThrow()

Throws exception if value absent.

## map()

Transforms value safely.

---

# 🔥 Functional Programming Connection

Optional works very well with:

* Lambdas
* Streams
* Functional pipelines

Example thinking:

optional.map().filter().ifPresent()

---

# ⚠️ Common Mistakes

* Using Optional for class fields
* Calling get() without checking
* Treating Optional as a replacement for every null

---

# 🏁 Summary

Optional helps create safer APIs by making absence of value explicit.

It is heavily used in modern backend development and Spring Data repositories.
