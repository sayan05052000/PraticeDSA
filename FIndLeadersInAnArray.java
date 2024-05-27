package sorting.questions;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FIndLeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int maxToRight = arr[n-1];
        list.add(maxToRight);
        for(int i = n-2;i>=0;i--){
            if(arr[i]>=maxToRight){
                maxToRight = arr[i];
                list.add(maxToRight);
            }
        }
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
    }
}
