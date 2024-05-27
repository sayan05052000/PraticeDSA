public class Pallindrome {
    public static boolean isPalindrome(String s) {
        String inputString = s.toLowerCase().replaceAll("[\\W_]","");
        StringBuilder s1 = new StringBuilder();
        for(int i =inputString.length()-1;i>=0;i--){
            s1.append(inputString.charAt(i));
        }
        return s1.toString().equals(inputString);
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("ab_a"));
    }
}
