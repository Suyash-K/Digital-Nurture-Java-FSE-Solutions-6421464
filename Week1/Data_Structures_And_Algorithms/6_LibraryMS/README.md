# Exercise 6: Library Management System

## Algorithms Used

- **Linear Search** on an unsorted array of `Book` objects.  
- **Binary Search** on a sorted array of `Book` objects (sorted by title).

## Analysis

| Algorithm       | Best Case   | Average Case | Worst Case  | Space Complexity | Notes                          |
|-----------------|-------------|--------------|-------------|------------------|--------------------------------|
| **Linear Search** | O(1)        | O(n/2) ≈ O(n)| O(n)        | O(1)             | No sorting needed.             |
| **Binary Search** | O(1)        | O(log n)     | O(log n)    | O(1)             | Requires sorted data.          |

- **Linear Search** scans each element until a match is found or the end is reached.  
- **Binary Search** repeatedly halves the search interval, requiring upfront sorting.

## When to Use Which

- **Small or unsorted catalogs**:  
  Use **linear search**—no sorting overhead, direct scan suffices for small n.

- **Large, mostly-read-only catalogs**:  
  Use **binary search**. Sort once (O(n log n)), then perform searches in O(log n) each. Ideal when many lookups far outweigh occasional inserts.

> **Tip**: For dynamic catalogs with frequent additions/removals and high lookup volume, consider indexed structures (e.g., `TreeMap` or full-text search engines) for even faster and more flexible querying.  
