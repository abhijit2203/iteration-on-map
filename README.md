# Iteration on Map in Java

This project demonstrates different ways to iterate over a `HashMap` in Java.

## Topics Covered

- Iteration using `entrySet()`
- Iteration using `keySet()`
- Iteration using `forEach()`
- Understanding `Map.Entry`
- Java 8 Lambda Expression

---

# Project Structure

```text
src
│
├── iterationOnMap_using_entrySet
│   └── Program1.java
│
├── iterationOnMap_using_keySet
│   └── Program1.java
│
└── iterationOnMap_using_forEach
    └── Program1.java
```

---

# 1. Iteration Using entrySet()

## Description

`entrySet()` returns a set view of all key-value pairs present in the map.

It is the most efficient way to iterate over a map because both key and value are accessed directly.

## Example

```java
for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

    System.out.println(entry.getKey() + "-->" + entry.getValue());
}
```

## Advantages

- Better performance
- Direct access to key and value
- Most preferred approach in interviews

---

# 2. Iteration Using keySet()

## Description

`keySet()` returns all keys from the map.

Values are accessed using `map.get(key)`.

## Example

```java
for(Integer key : map.keySet()) {

    System.out.println(key + "-->" + map.get(key));
}
```

## Disadvantage

`map.get(key)` performs additional lookup internally, so it is less efficient than `entrySet()`.

---

# 3. Iteration Using forEach()

## Description

`forEach()` was introduced in Java 8.

It uses Lambda Expression and internally works with `BiConsumer`.

## Example

```java
map.forEach((key,value) -> 
    System.out.println(key + "-->" + value)
);
```

## Advantages

- Short and clean syntax
- Modern Java approach
- Uses functional programming concepts

---

# Technologies Used

- Java
- HashMap
- Java Collections Framework
- Java 8 Features
- Eclipse IDE

---

# Concepts Learned

- Map Interface
- HashMap
- Map.Entry
- Lambda Expression
- BiConsumer
- Iteration Techniques

---

# Output Example

```text
20-->3
10-->2
12-->5
```

---

# Author

Abhijit Kumar

---

# Conclusion

This project helps understand different techniques to iterate over a `HashMap` in Java and explains the performance and working differences between them.
