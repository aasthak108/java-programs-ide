package searching;

public class LeftMostIndex {
    public static int leftMostIndex(int givenArray[], int left, int right, int givenNumber)
    {
        int result = -1;
        while (left <= right)
        {
            int mid;
            mid = (left + right) / 2;
            if (givenArray[mid] < givenNumber)
            {
                left = mid +1;
            } else if (givenArray[mid]== givenNumber) {
                result = mid;
                right = mid-1;
            } else
            {
                right  = mid -1;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,1,2,2,2,2,2,3,3,3,4};
        int givenNumber = 3;
        int left = 0;
        int right = arr.length - 1;
        System.out.println(leftMostIndex(arr, left, right, givenNumber));
    }
}

