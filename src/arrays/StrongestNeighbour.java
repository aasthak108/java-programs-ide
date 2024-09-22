package arrays;


class StrongestNeighbour {
    static int[] getStrongestNeighbour(int arr[])
    {
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
    public static void main(String args[])
    {
        int arr[] = {1,2,2,3,4,6};
        int[] array1 = new StrongestNeighbour().getStrongestNeighbour(arr);
        for(int i=0;i<array1.length;i++)
        {
            System.out.print(" "+array1[i]);
        }
    }
}

