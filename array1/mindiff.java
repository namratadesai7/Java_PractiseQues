package array1;
// Given an array of distinct integers, find all pairs of elements where the difference between the two elements is the smallest among all pairs in the array. Return these pairs in ascending order, where each pair is represented by [a, b], such that a, b are elements from the array and a < b. The difference between a and b should be the smallest possible.

// Example 1:
// Input:

// arr = [12, 9, 8, 2, 11]

// Output:

// [[8, 9], [11, 12]]

// Example 2:
// Input:

// arr = [22, 7, 1, 3, 11, 20, 19]

// Output:

// [[19, 20]]

// Constraints:
// 2 <= |arr| <= 100000

// -100000 <= arr[i] <= 100000


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class mindiff {
    
    public List<List<Integer>> minimumAbsDifference(int[] arr)
    {
      Arrays.sort(arr);	// sort the array
  
      int min_diff = Integer.MAX_VALUE;	// initialize minimum difference to a large number
  
      for (int i = 0; i < arr.length - 1; i++)
      {
  
          min_diff = Math.min(min_diff, arr[i + 1] - arr[i]);	// update minimum difference

      }
  
      List<List < Integer>> res = new ArrayList <> ();
      
      for (int i = 0; i < arr.length - 1; i++)
      {
  
          if (arr[i + 1] - arr[i] == min_diff)
          {
          	// if difference is equal to minimum difference
  
              List<Integer> pair = new ArrayList < > ();	// create new arraylist for the pair
  
              pair.add(arr[i]);
  
              pair.add(arr[i + 1]);
  
              res.add(pair);	// add the pair to the result
  
          }
      }
  
      return res;
  
  }
  public static void main(String[] args) {
    int[] arr1 = {12, 9, 8, 2, 11};
    int[] arr2 = {22, 7, 1, 3, 11, 20, 19};

    mindiff solution = new mindiff();

    System.out.println("Output for arr1:");
    List<List<Integer>> result1 = solution.minimumAbsDifference(arr1);
    for (List<Integer> pair : result1) {
        System.out.println(pair);
    }

    System.out.println("\nOutput for arr2:");
    List<List<Integer>> result2 = solution.minimumAbsDifference(arr2);
    for (List<Integer> pair : result2) {
        System.out.println(pair);
    }
}
}
