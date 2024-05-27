package sorting.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MoveZeroes {
    static void move(int[] nums){
        if(nums.length<=1){
            return;
        }
        int i = -1;
        for(int k = 0;k<nums.length && nums[k]!=0;k++){
            i++;
        }
        int j = 0;
        while(j<nums.length-1){
            if(nums[j] == 0 && nums[j+1]!=0){
                nums[i+1] = nums[i+1]+nums[j+1];
                nums[j+1] = nums[i+1] - nums[j+1];
                nums[i+1] = nums[i+1] - nums[j+1];
                i = i+1;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] n = {0,1,0,3,12};
        move(n);
    }
}
