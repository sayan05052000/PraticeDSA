import java.util.Scanner;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Please enter the "+(i+1)+"th element of the array");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int secondMax = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i]!=max){
                secondMax = Math.max(arr[i],secondMax);
            }
        }
        System.out.println("The second largest element is "+secondMax);
    }
}
