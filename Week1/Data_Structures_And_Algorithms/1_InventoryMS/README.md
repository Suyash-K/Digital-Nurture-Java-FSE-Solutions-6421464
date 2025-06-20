# Exercise 1: Inventory Management System

## Data Structure Used

We use a **`HashMap<Integer, Product>`** to store products by their `productId`.  
- **Average time complexity** for insert, lookup, update, and delete is **O(1)**.  
- Provides fast, key‑based access to each `Product` instance.

## Analysis

| Operation | Time Complexity | Explanation                                    |
|-----------|-----------------|------------------------------------------------|
| **Add**   | O(1)            | `HashMap.put(key, value)` is constant time on average. |
| **Update**| O(1)            | `HashMap.get(key)` + field modifications.     |
| **Delete**| O(1)            | `HashMap.remove(key)` is constant time on average. |

## Optimization Ideas

- **Load‑factor tuning**  
  Adjust the `HashMap` load factor (default 0.75) to trade off between memory usage and rehash frequency, e.g. initialize with a higher capacity if you know inventory size in advance.
- **Concurrent access**  
  Use `ConcurrentHashMap` for thread‑safe operations in multi‑threaded environments without blocking the entire map.
- **Secondary indexes**  
  Maintain additional maps (e.g., `Map<String, Set<Product>>` for product names or categories) to support fast lookups by other fields.
- **Batch operations**  
  Group multiple insert/update/delete calls in a single transaction or bulk loop to reduce overhead and improve cache locality.
- **Alternate structures for sorted queries**  
  If you require range queries or sorted iterations (e.g., list products in ID order), consider a `TreeMap<Integer, Product>` which provides O(log n) operations but maintains natural ordering.  
