public class OneTwoNWithOutLoop {
 static int [] arr ;
    public static int[] printNos(int x) {
        if (arr == null){
            arr = new int[x];
        }
        arr[x-1]=x;
        if (x==1) {
            return arr;
        }
        printNos(x-1);
        return arr;
    }
    public static void main(String[] args) {
printNos(5);
    }
}
