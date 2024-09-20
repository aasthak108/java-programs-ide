package arrays;
//used sum of n natural number formula
public class FindMissingNumberInRange
{
    public static int findMissingNumber(int arr[])
    {
        int arraySum=0;
        int n = arr.length;
        int sumOfNumbers=0;
        for(int i =0;i<arr.length;i++)
        {
            arraySum +=arr[i];
        }
        sumOfNumbers = ((n * (n+1))/2);
        int answer = sumOfNumbers - arraySum;
        return answer;
    }
    public static void main(String args[])
    {
        int arr[] = {0,1,3};
        System.out.println(""+ findMissingNumber(arr));
    }
}
