import java.util.Scanner;

public class FindLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Please enter the "+(i+1)+"th element of the array");
            arr[i] = sc.nextInt();
        }
        if(arr.length == 0){
            System.out.println("The max element is "+-1);
        }else {
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, arr[i]);
            }
            System.out.println("The max element is " + max);
        }
    }
}
