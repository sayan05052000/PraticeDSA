import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        while(input!=0){
            count++;
            input = input/10;
        }
        System.out.println("Count"+count);
    }
}
