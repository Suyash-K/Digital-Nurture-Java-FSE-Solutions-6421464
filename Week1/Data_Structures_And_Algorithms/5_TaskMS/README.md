# Exercise 5: Task Management System

## Data Structure Used

We use a **singly linked list** to store `Task` nodes.  
- Each node contains a `Task` object and a pointer to the next node.  
- Dynamic growth: no fixed capacity; nodes allocated on demand.

## Analysis

| Operation   | Time Complexity | Explanation                                 |
|-------------|-----------------|---------------------------------------------|
| **Add**     | O(n)            | Must traverse to the list’s end to append. |
| **Search**  | O(n)            | Linear scan until matching `taskId`.       |
| **Traverse**| O(n)            | Visit each node once.                      |
| **Delete**  | O(n)            | Search + pointer update.                   |

## Advantages of Linked Lists over Arrays

- **Dynamic Size**: Grow or shrink at runtime without resizing overhead.  
- **O(1) Insert/Delete** at head or known node location (no shifting required).  
- **Memory Utilization**: No wasted slots; only allocate what you need.  
- **Flexible Reordering**: Splicing nodes is efficient.

> **Note**: For frequent random access by index, arrays or ArrayLists (O(1) access) may be preferable. Linked lists excel when insertion and deletion in the middle of the collection are common.  
