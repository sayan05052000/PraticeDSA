import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        long reverseNumber = 0;
        int input = new Scanner(System.in).nextInt();
        while(input!=0){
            reverseNumber = reverseNumber*10+(input%10);
            input = input/10;
        }
        if (reverseNumber< -1*Math.pow(2,31) || reverseNumber>Math.pow(2,31)-1){
            System.out.println(0);
        }
    }
}
