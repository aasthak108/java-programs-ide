package recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,int A,int B,int C)
    {
        if(n<=0)
        {
            return;
        }
        towerOfHanoi(n-1,A,C,B);
        System.out.println("the disc"+ n + "is moved from"+A +"to"+C);
        towerOfHanoi(n-1,B,A,C);
    }
    public static void main(String args[])
    {
        int n=2;
        int A=01,B=02,C=03;
        towerOfHanoi(n,A,B,C);
    }

}
