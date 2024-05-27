import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FabonacciSeries {
     public static int fab(int n){
         if(n==0){
             return 0;
         }
         return fab(0,1,n-1);
     }

     public static int fab(int a,int b,int count){
         int sum =a+b;
         if (count <= 1)
             return sum;
         a= b;
         b=sum;
         return fab(a,b,count-1);
     }

    public static int[] generateFibonacciNumbers(int n) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(0);
        if (n==1) {
            return num.stream().mapToInt(Integer::intValue).toArray();
        }
        num.add(1);
        if (n==2) {
            return num.stream().mapToInt(Integer::intValue).toArray();
        }
        return generateFibonacciNumbers(num, n);
    }
    public static int[] generateFibonacciNumbers(ArrayList<Integer> nums, int n) {
        if(n <= 2){
            return nums.stream().mapToInt(Integer::intValue).toArray();
        }
        nums.add(nums.get(nums.size()-1)+nums.get(nums.size()-2));
        return generateFibonacciNumbers(nums, n-1);
    }

     public static void main(String[] args){
         System.out.println(Arrays.toString(generateFibonacciNumbers(3)));
     }
}
