public class LargestSequenceIntegerWithSumK {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int count = 0;
        int max = 0;
        int sum = 0;
        boolean sumReached = false;
        for(int i:A){
            sum+=i;
            if(sum<=K){
                count++;
            }else{
                if(i<=K){
                    sum = i;
                    count = 1;
                }else{
                    sum = 0;
                    count = 0;
                }
            }
            if(sum == K){
                max = Math.max(count,max);
                sumReached = true;
            }
        }
        return sumReached?max:0;
    }

    public static void main(String[] args) {
        int[] n = {-13 ,0, 6 ,15 ,16 ,2 ,15, -12 ,17 ,-16, 0, -3 ,19 ,-3 ,2 ,-9 ,-6};
        lenOfLongSubarr(n,n.length,15);
    }

}
