# Exercise 7: Financial Forecasting

## Algorithm Used

We compute future value over a series of growth rates using:

- **Recursive approach**  
  Calls itself on decreasing `n` until base case (`n=0`), then multiplies back up.
- **Memoized recursion**  
  Caches each `FV(i)` in a `Double[]` to avoid redundant work.
- **Iterative alternative**  
  A simple loop accumulating `principal *= (1 + rate)` in O(n) time, O(1) space.

## Analysis

| Version               | Time Complexity | Space Complexity     | Notes                                                    |
|-----------------------|-----------------|----------------------|----------------------------------------------------------|
| **Recursive**         | O(n)            | O(n) call stack      | Single linear chain of calls, one per period.           |
| **Memoized**          | O(n)            | O(n) for memo array  | Each intermediate result stored and reused (no repeats).|
| **Iterative**         | O(n)            | O(1)                 | Minimal overhead—preferred in practice.                  |

## Optimization Ideas

- **Use iteration** instead of recursion to eliminate call‑stack overhead.  
- **Parallel divide‑and‑conquer**: split periods into chunks, compute sub‑products concurrently, then multiply.  
- **Vectorized exponentiation**: if growth rate is constant, use `Math.pow(1 + r, n)` for O(1) computation.  
- **Lazy evaluation**: compute only when needed and cache frequently queried horizons in a lookup table.  
