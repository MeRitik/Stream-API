# 🚀 Java Streams Practice Set

Practice and master Java Streams with these **50+ problems**, grouped by difficulty. Problems cover filtering, mapping,
sorting, grouping, collectors, custom logic, parallel streams, and real-world scenarios. Use this as a roadmap to
progress from basics to expert-level stream manipulations.

---

## 📗 Level 1: Basics (10 Qs)

*Focus: Filtering, mapping, sorting, basic collectors.*

1. **Filter Even Numbers**  
   Given a list of integers, use streams to return only even numbers.

2. **Uppercase Strings**  
   Convert a list of strings into uppercase using streams.

3. **Find Squares**  
   Given a list of numbers, return a list of their squares.

4. **Sort Names**  
   Sort a list of names alphabetically using streams.

5. **Remove Duplicates**  
   Given a list of integers, return a list with duplicates removed.

6. **Find Max Number**  
   Use streams to find the maximum number from a list.

7. **Find Min Number**  
   Use streams to find the minimum number from a list.

8. **Count Elements**  
   Count how many elements are present in a given list.

9. **First Element**  
   Find the first element of a list (if present).

10. **Check Any Match**  
    Check if any string in a list starts with "A".

---

## 📘 Level 2: Intermediate (15 Qs)

*Focus: Grouping, partitioning, advanced collectors.*

11. **Sum of Integers**  
    Find the sum of a list of integers using `reduce`.

12. **Average Marks**  
    Given a list of student marks, calculate the average.

13. **Word Length Map**  
    Convert a list of words into a `Map<word, length>`.

14. **Group By Length**  
    Group words by their length into a map.

15. **Partition Odd and Even**  
    Partition integers into odd and even lists.

16. **Find Longest String**  
    Find the longest string from a list using streams.

17. **Find Shortest String**  
    Find the shortest string from a list.

18. **Frequency of Characters**  
    Given a string, find the frequency of each character.

19. **Frequency of Words**  
    Given a sentence, count the frequency of each word.

20. **Join Strings**  
    Join a list of strings with a delimiter (e.g., comma).

21. **Top 3 Largest Numbers**  
    Find the top 3 largest numbers in a list.

22. **Top 3 Smallest Numbers**  
    Find the top 3 smallest numbers in a list.

23. **Sort By Length**  
    Sort a list of strings based on length.

24. **Check All Match**  
    Check if all strings in a list contain only lowercase letters.

25. **Find Distinct Squares**  
    Find distinct squares from a list of integers.

---

## 📙 Level 3: Advanced (15 Qs)

*Focus: Nested collectors, flatMap, advanced grouping, statistics.*

26. **Flatten List of Lists**  
    Convert `List<List<Integer>>` into `List<Integer>`.

27. **Employee Department Grouping**  
    Given a list of employees, group them by department.

28. **Employee Salary Avg**  
    Find average salary per department using grouping.

29. **Find Highest Paid Employee per Dept**  
    Use `Collectors.groupingBy` + `maxBy`.

30. **Find Lowest Paid Employee per Dept**  
    Similar to above with `minBy`.

31. **Total Salary per Dept**  
    Find the total salary spent in each department.

32. **Find Duplicate Elements**  
    Find all duplicate elements in a list.

33. **Find Nth Highest Number**  
    Find the nth highest number from a list using streams.

34. **Find Palindromes**  
    From a list of strings, return palindromes only.

35. **Character Sorting**  
    Given a string, return characters sorted alphabetically.

36. **Most Frequent Element**  
    Find the most frequently occurring element in a list.

37. **Least Frequent Element**  
    Find the least frequently occurring element in a list.

38. **Multi-level Grouping**  
    Group employees by dept, then by gender.

39. **Statistics Collector**  
    Find count, sum, min, max, average salary using `summarizingInt`.

40. **Custom Collector**  
    Write a collector to concatenate strings in uppercase.

---

## 📕 Level 4: Expert / Real-world (15–20 Qs)

*Focus: Performance, parallel streams, custom logic.*

41. **Parallel Stream Sum**  
    Compare time taken for sum using normal vs parallel stream.

42. **Prime Numbers Filter**  
    Given a range of numbers, return primes only.

43. **Anagrams Grouping**  
    Group a list of words into sets of anagrams.

44. **K Most Frequent Words**  
    Find top `k` most frequent words from a paragraph.

45. **Employee Age Stats**  
    Find min, max, avg age of employees.

46. **Transaction Filtering**  
    Given a list of transactions, filter all > 10,000.

47. **Sort Employees by Multiple Fields**  
    First by dept, then by salary.

48. **Custom Comparator Sorting**  
    Sort products by price desc, then name asc.

49. **Find Second Highest Salary Employee**  
    Using streams only.

50. **Find Second Lowest Salary Employee**  
    Using streams only.

51. **Complex FlatMap**  
    Given a list of `Employee -> List<Project>`, flatten all projects.

52. **CSV Parsing Simulation**  
    Given a list of lines (comma-separated), map into objects.

53. **Word Count from File**  
    Read lines, split into words, count frequency.

54. **Find Duplicate Words in File**  
    Use streams to detect repeated words.

55. **Parallel Stream Sorting**  
    Sort a large dataset using parallel streams & benchmark.

56. **Custom Reduction**  
    Implement factorial using `reduce`.

57. **Sliding Window Max (with Streams)**  
    For list of integers, find max in sliding window size k.

58. **Implement LRU Cache Stats**  
    Given access logs, find top-k frequently accessed items.

59. **Detect Cycles in Data**  
    Given a dependency list, detect circular references (advanced use of streams).

60. **Reactive Simulation**  
    Use infinite `Stream.iterate` to generate Fibonacci numbers.

---

## 📝 Usage

- Implement each problem as a class or method inside the `practiceSet` package.
- Start with **Level 1** and progressively solve advanced ones.
- Try to use only Streams API for all manipulations.
- Explore edge cases and optimize for performance in higher-level problems!

Happy coding! 🚀