package searching;

public class FloorValue {
    static int floorValue(int givenArray[],int givenNumber,int size)
    {
        int mid;
        int left =0;
        int right=size-1;
        while(left<=right)
        {
            mid = left+right/2;
            if(givenArray[mid]>givenNumber)
            {
                right = mid-1;
            }
            else if(givenArray[mid]<givenNumber)
            {
                if(givenArray[mid+1]>givenNumber)
                {
                    return mid;
                }
            }
            else if(givenArray[mid+1]>givenNumber)
            {
                left = mid+1;
            }
            else if(left == right) {
                return givenArray[left];
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int givenArray[] ={1,8,10,11,12,19};
        int size = 6;
        int givenNumber = 1;
        System.out.println(floorValue(givenArray,givenNumber,size));
    }
}
