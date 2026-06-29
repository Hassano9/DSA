# 🧩 DSA Solutions in Java

A comprehensive collection of Java solutions for Data Structures & Algorithms problems, featuring both **brute force** and **optimal** implementations for each problem.

---

## 📋 Problem List

| # | Problem | Difficulty | LeetCode | Source File |
|---|---------|------------|----------|-------------|
| 1 | Find Closest Number to Zero | 🟢 Easy | [#2239](https://leetcode.com/problems/find-closest-number-to-zero/) | `FindClosestNumbertoZerobrute.java` |
| 2 | Is Subsequence | 🟢 Easy | [#392](https://leetcode.com/problems/is-subsequence/) | `IsSubsequenceBruteForce.java` |
| 3 | Summary Ranges | 🟢 Easy | [#228](https://leetcode.com/problems/summary-ranges/) | `summaryRangesBruteforce.java` |
| 4 | Invert Binary Tree | 🟢 Easy | [#226](https://leetcode.com/problems/invert-binary-tree/) | `InvertBinaryTreeBruteforce.java` |
| 5 | Max Depth of Binary Tree | 🟢 Easy | [#104](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | `MaxDepthBinaryTreeBruteForce.java` |
| 6 | Contains Duplicate | 🟢 Easy | [#217](https://leetcode.com/problems/contains-duplicate/) | `ContainsDuplicateBruteForce.java` |
| 7 | Two Sum | 🟢 Easy | [#1](https://leetcode.com/problems/two-sum/) | `TwoSumBruteForce.java` |
| 8 | Reverse String | 🟢 Easy | [#344](https://leetcode.com/problems/reverse-string/) | `ReverseStringBruteForce.java` |
| 9 | Valid Palindrome | 🟢 Easy | [#125](https://leetcode.com/problems/valid-palindrome/) | `ValidPalindromeBruteForce.java` |
| 10 | Kth Largest Element | 🟡 Medium | [#215](https://leetcode.com/problems/kth-largest-element-in-an-array/) | `KthLargestBruteForce.java` |
| 11 | Last Stone Weight | 🟢 Easy | [#1046](https://leetcode.com/problems/last-stone-weight/) | `LastStoneWeightBruteForce.java` |
| 12 | Linked List Cycle | 🟢 Easy | [#141](https://leetcode.com/problems/linked-list-cycle/) | `LinkedListCycleBruteForce.java` |
| 13 | Remove Duplicates | 🟢 Easy | [#83](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | `RemoveDuplicatesBruteForce.java` |

---

## ⏱️ Complexity Overview

| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---------|-----------|-------------|--------------|---------------|
| Find Closest Number | O(N²) | O(1) | O(N) | O(1) |
| Is Subsequence | O(2ᴺ) | O(N) | O(N) | O(1) |
| Summary Ranges | O(N²) | O(1) | O(N) | O(1) |
| Invert Binary Tree | O(N) | O(N) | O(N) | O(H) |
| Max Depth | O(N) | O(N) | O(N) | O(H) |
| Contains Duplicate | O(N²) | O(1) | O(N) | O(N) |
| Two Sum | O(N²) | O(1) | O(N) | O(N) |
| Reverse String | O(N) | O(N) | O(N) | O(1) |
| Valid Palindrome | O(N) | O(N) | O(N) | O(1) |
| Kth Largest | O(N log N) | O(1) | O(N log K) | O(K) |
| Last Stone Weight | O(N² log N) | O(1) | O(N log N) | O(N) |
| Linked List Cycle | O(N) | O(N) | O(N) | O(1) |
| Remove Duplicates | O(N) | O(N) | O(N) | O(1) |

> **H** = height of the tree (O(log N) balanced, O(N) worst case)

---

## 🧠 Approach Breakdown

<details>
<summary><strong>Find Closest Number to Zero</strong></summary>

- **Brute Force:** Check all elements using nested iteration or repeated comparison.
- **Optimal:** Single linear scan tracking the value with the minimum absolute difference.
</details>

<details>
<summary><strong>Is Subsequence</strong></summary>

- **Brute Force:** Generate all possible subsequences and check for a match.
- **Optimal:** Two-pointer approach — verify character order in a single pass.
</details>

<details>
<summary><strong>Summary Ranges</strong></summary>

- **Brute Force:** Manually verify every number's existence to determine ranges.
- **Optimal:** Traverse the sorted array once, grouping consecutive numbers dynamically.
</details>

<details>
<summary><strong>Invert Binary Tree</strong></summary>

- **Brute Force:** Level-order traversal with redundant storage.
- **Optimal:** Recursive DFS or iterative BFS that swaps children at each node.
</details>

<details>
<summary><strong>Max Depth of Binary Tree</strong></summary>

- **Brute Force:** Store all root-to-leaf paths and compare their lengths.
- **Optimal:** Recursively calculate depth as `1 + max(leftDepth, rightDepth)`.
</details>

<details>
<summary><strong>Contains Duplicate</strong></summary>

- **Brute Force:** Compare every element with every other element — O(N²).
- **Optimal:** Use a `HashSet` to detect duplicates in linear time.
</details>

<details>
<summary><strong>Two Sum</strong></summary>

- **Brute Force:** Check all possible pairs to find the target sum.
- **Optimal:** Use a `HashMap` to store visited indices, enabling O(1) lookups.
</details>

<details>
<summary><strong>Reverse String</strong></summary>

- **Brute Force:** Create an auxiliary string/array and build the reverse.
- **Optimal:** Swap elements in-place using two pointers from both ends.
</details>

<details>
<summary><strong>Valid Palindrome</strong></summary>

- **Brute Force:** Clean and reverse the string, then compare.
- **Optimal:** Two pointers converging inward — no extra space needed.
</details>

<details>
<summary><strong>Kth Largest Element</strong></summary>

- **Brute Force:** Sort the entire array and index the result.
- **Optimal:** Min-Heap of size K — maintain only the largest K elements.
</details>

<details>
<summary><strong>Last Stone Weight</strong></summary>

- **Brute Force:** Sort the array after every smash operation.
- **Optimal:** Max-Heap to efficiently retrieve and process the two heaviest stones.
</details>

<details>
<summary><strong>Linked List Cycle</strong></summary>

- **Brute Force:** Store all visited nodes in a `HashSet`.
- **Optimal:** Floyd's Tortoise and Hare — two pointers at different speeds.
</details>

<details>
<summary><strong>Remove Duplicates</strong></summary>

- **Brute Force:** Traverse the list repeatedly to find and remove duplicates.
- **Optimal:** Single pointer comparing each node to the next in the sorted list.
</details>

---

## 🚀 How to Run

Make sure you have the [JDK](https://www.oracle.com/java/technologies/downloads/) installed, then run any solution from its directory:

```bash
javac FileName.java && java FileName
```

**Example:**

```bash
javac TwoSumBruteForce.java && java TwoSumBruteForce
```

---

## 📁 Repository Structure

```
dsa/
├── arrays/
├── strings/
├── trees/
├── linked-lists/
└── heaps/
```

---

## 🤝 Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request if you'd like to add a new problem, improve an existing solution, or fix a bug.

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
