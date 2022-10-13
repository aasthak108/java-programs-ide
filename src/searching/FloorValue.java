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
            if(givenArray[mid]<givenNumber)
            {
                left = mid+1;
            }
            if(givenArray[mid]<givenNumber && givenArray[mid+1]>givenNumber)
                {
                    left = mid+1;
                }
            if(givenArray[mid+1]>givenNumber)
            {
                left = mid+1;
            }
            if(left == right) {
                return givenArray[left];
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int givenArray[] ={1,8,10,11,12,19};
        int size = 6;
        int givenNumber = 18;
        System.out.println(floorValue(givenArray,givenNumber,size));
    }
}
