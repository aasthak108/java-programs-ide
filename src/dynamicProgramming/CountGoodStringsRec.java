package dynamicProgramming;

public class CountGoodStringsRec {
        public static int countGoodStrings(int high,int low,int one,int zero)
        {
            return helper(high,low,one,zero,0);
        }
        public static int helper(int high,int low,int one,int zero,int len)
        {
            int count=0;
            int mod = 100000007;
            if(len>high)
            {
                return 0;
            }
            if(len>= low && low<=high)
            {
                count++;
            }
            int oneCount = helper(high,low,one,zero,len+one)%mod;
            int zeroCount = helper(high,low,one,zero,len+zero)%mod;
            count = (count + oneCount + zeroCount) %mod;
            return count;
        }
        public static void main(String args[])
        {
            System.out.println(""+ countGoodStrings(3,3,1,1)); //output->8
            System.out.println(""+ countGoodStrings(3,2,2,1)); //output->5
        }
}
