package array1;
public class array
{
    
   	// Fills temp[] with two copies of arr[]
    public static void preprocess(int arr[], int n, int temp[])
    {
       	// Store arr[] elements at i and i + n
        for (int i = 0; i < n; i++)
            temp[i] = temp[i + n] = arr[i];
    }

   	// Function to left rotate an array k time
    public static int[] rotateLeft(int arr[], int n, int k,
        int temp[])
    {
       	// Starting position of array after k
       	// rotations in temp[] will be k % n
        int start = k % n;

        int[] nArr = new int[n];
        for (int i = start; i < start + n; i++)
            nArr[i - start] = temp[i];

        return nArr;
    }

  static int[][] multipleLeftRotation(int[] A, int[] B)
    {
        int n = A.length, m = B.length;
        int temp[] = new int[2 *n];
        preprocess(A, n, temp);

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; ++i)
        {
            int k = B[i];
            ans[i] = rotateLeft(A, n, k, temp);
        }
      
        return ans;
    }
    public static void main(String[] args)
{
    int a[]={1,2,3,4,5};
    int b[]={2,3};
    int ans[][]=multipleLeftRotation(a,b);
                                                                                                                                                                      
    for (int[] e : ans) {
        for (int i : e) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing each row
    }
}}