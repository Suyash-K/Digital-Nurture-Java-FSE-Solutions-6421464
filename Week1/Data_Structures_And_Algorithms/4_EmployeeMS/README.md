# Exercise 4: Employee Management System

## Array Representation

In memory, arrays are contiguous blocks of elements:
- **Indexing**: Constant-time access `array[i]`.
- **Fixed size**: Capacity set at creation; no dynamic resizing.
- **Low overhead**: Minimal metadata, excellent cache locality.

## Data Structure Used

We use a plain **`Employee[]` array** of fixed capacity.  
- **Add**, **search**, **delete** operations work by direct index manipulation and linear scans.  
- **Traverse** prints each populated slot.

## Analysis

| Operation   | Time Complexity | Explanation                                    |
|-------------|-----------------|------------------------------------------------|
| **Add**     | O(1)            | Insert at end using `employees[size++]`.       |
| **Search**  | O(n)            | Linear scan until matching `employeeId`.       |
| **Traverse**| O(n)            | Visit each of the `size` elements.             |
| **Delete**  | O(n)            | Search + shift subsequent elements left.       |

## Limitations & Use Cases

- **Fixed capacity**: Must choose max size up front (or reallocate manually).  
- **No direct deletion**: Removing an element requires shifting.  
- **When to use**:  
  - Small, bounded collections where operations are infrequent.  
  - When low‑level control over memory layout and absolute minimal overhead is required.  
  - In performance‑critical inner loops benefiting from cache locality.  
- **Alternatives**:  
  - **`ArrayList<Employee>`**: Dynamic resizing, but slight overhead on resizes.  
  - **`HashMap<Integer,Employee>`**: O(1) search/delete by ID, better for large or dynamic datasets.  
