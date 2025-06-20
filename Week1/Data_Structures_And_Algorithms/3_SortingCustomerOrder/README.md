# Exercise 3: Sorting Customer Orders

## Data Structure Used

We store orders in an **array** (`Order[]`) for in‑place sorting.

## Analysis

| Algorithm       | Best Case   | Average Case | Worst Case  | Space Complexity | Stable? |
|-----------------|-------------|--------------|-------------|------------------|---------|
| **Bubble Sort** | O(n)        | O(n²)        | O(n²)       | O(1)             | Yes     |
| **Quick Sort**  | O(n log n)  | O(n log n)   | O(n²)       | O(log n) (recursion) | No      |

- **Bubble Sort** repeatedly swaps adjacent elements; good for nearly‑sorted data but degrades quadratically.
- **Quick Sort** uses divide‑and‑conquer and typically runs in O(n log n), but worst‑case O(n²) if pivot choices are poor.

## Why Quick Sort Is Preferred

1. **Average Performance**: Quick Sort’s O(n log n) average time significantly outperforms Bubble Sort’s O(n²) on large datasets.  
2. **Cache Efficiency**: Its in‑place partitioning exhibits good locality.  
3. **Practical Optimizations**: With pivot‑selection strategies (e.g., median‑of‑three) and tail recursion elimination, the worst‑case is rare.  
4. **Space Trade‑off**: Although it uses O(log n) stack space, this is acceptable compared to the dramatic speed gains.

> **Note**: For guaranteed O(n log n) worst‑case, consider **Merge Sort** (requires O(n) extra space) or **Heap Sort** (in‑place, O(n log n) worst case).
