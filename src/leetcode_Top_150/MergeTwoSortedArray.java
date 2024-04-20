package leetcode_Top_150;

public class MergeTwoSortedArray {
    public static void mergeArraySorted(int arr1[],int m, int arr2[],int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && arr1[p1] > arr2[p2]) {
                arr1[i] = arr1[p1];
                p1--;
            } else {
                arr1[i] = arr2[p2];
                p2--;
            }
            i--;
        }
    }

        static void printArray(int arr[], int n)
        {
            System.out.println ( "Array A after merging B in sorted order : " ) ;
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] +" ");
        }

    public static void main(String args[]){
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m =3;
        int n =3;

        mergeArraySorted(arr1, m, arr2, n);
        printArray(arr1,6);

    }
}
