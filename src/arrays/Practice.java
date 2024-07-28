package arrays;

public class Practice {
    public static int[] practice(int arr[]) {
        int count =0;
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]<= arr[i+1])
                count++;
        }
        int[] arr2 = new int[count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(count ==1 )
            {
                arr2[j]=arr[i];
            }
            else if (i==0 && arr[i] == arr[i+1]) {
                arr2[j] = arr[i];
                j++;
            }
            else if(i == arr.length-1 && arr[arr.length-1]>=arr[arr.length-2])
            {
                arr2[j]=arr[i];
                j++;
            }
            else if(i!=0 && i!=arr.length-1)
            {
                arr2[j]=arr[i];
                j++;
            }
        }
        return arr2;
    }

    public static void main(String args[]) {
        int arr[] = {5,5};
        int[] array = new Practice().practice(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}

