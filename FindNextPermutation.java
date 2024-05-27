package sorting.questions;

public class FindNextPermutation {
    static int[] findNextPermutation(int[] n){
        int  i =  n.length-2;
        boolean arraySorted = true;
        for(i = n.length-2;i>=-1;i--){
            int nextMaxIndex = i+1;
            int maxIndex = i+1;
            for(int j = i+1;j<n.length;j++){
                if(n[j]>n[maxIndex]){
                    maxIndex = j;
                    nextMaxIndex = j;
                }
                if(n[nextMaxIndex]>n[j] && n[j]>n[i+1]){
                    nextMaxIndex = j;
                }
            }
            if(nextMaxIndex!=i+1){
                swap(n, nextMaxIndex, i+1);
                arraySorted = false;
                break;
            }
        }
        if(arraySorted){
            reverseArray(n);
        }
        return n;
    }

    private static void swap(int[] n, int j, int i) {
        int temp = n[j];
        n[j] = n[i];
        n[i] = temp;
    }

    public static void reverseArray(int[] n){
        int i = 0;int j = n.length-1;
        while (i<j){
            swap(n,i++,j--);
        }
    }

    public static void main(String[] args) {
        int[] n = {2,1,5,4,3,0,0};
        findNextPermutation(n);
    }
}
