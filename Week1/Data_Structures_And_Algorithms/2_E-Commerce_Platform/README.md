# Exercise 2: E-commerce Platform Search Function

## Data Structure Used

- **Unsorted array (`Product[]`)** for **linear search**.
- **Sorted array (`Product[]`)** for **binary search** (sorted by `productId`).

## Analysis

| Algorithm       | Structure       | Best Case   | Average Case    | Worst Case      |
|-----------------|-----------------|-------------|-----------------|-----------------|
| **Linear Search** | Unsorted Array  | O(1) (first element) | O(n/2) ≈ O(n)   | O(n) (not found) |
| **Binary Search** | Sorted Array    | O(1) (middle element) | O(log n)       | O(log n)        |

- **Linear Search** scans each element until it finds the target or reaches the end.
- **Binary Search** repeatedly divides the search interval in half, requiring a sorted dataset.

## Algorithm Suitability

- **Small or unsorted datasets**:  
  Linear search is simple to implement and requires no preprocessing, but performs poorly as size grows.
- **Large, mostly-read-only datasets**:  
  Binary search is far more efficient (O(log n)), but you must keep the array sorted (O(n log n) to sort initially, then O(log n) per query).
- **E‑commerce scenario**:  
  For high‑traffic search with millions of products, maintain a sorted index (or better, a specialized search structure like a B‑tree or inverted index) and use binary search (or more advanced search algorithms) for fast lookups.  
