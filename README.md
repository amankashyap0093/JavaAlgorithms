# JavaAlgorithms

Please find below the list of algorithms implemented:

**1. Merge Sort:**

      A. Follows Divide and Conquer approach.

      B. Time Complexity - O(n log(n))

      C. Space Complexity - O(n)

      D. Stable Algorithm 
      
 **2. Quick Sort:**

      A. Follows Divide and Conquer approach.

      B. Time Complexity - Best Case - O(n log(n))  - Worst Case - O(n2)
      **Worst Case** - It happens when the pivot value selected is always the highest or the lowest element. 
      Algorithm can be enhanced to take a random element as pivot in-order to avoid worst case scenario.

      C. Space Complexity - Space is used to store the recursion Stack.
      Worst Case - O(n) - This happens when the list is already sorted.
      Best Case - O(log(n))

      D. Not a Stable Algorithm. An algorithm is called stable, when it maintains the relative order of records in case of equality of keys i.e. it maintain original order of the equal keys
      Example:
      If Input Array is - INPUT: (4,5), (3, 2) (4, 3) (5,4) (6,4)
      Stable Algorithm will return output as - (3, 2),  (4, 5),  (4,3),  (5,4),  (6,4)
      Un-stable algorithm will return output as - (3, 2),  (4, 3),  (4,5),  (5,4),  (6,4)
      
      E. In-place Sorting Algorithm
