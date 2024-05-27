package sorting.questions;

public class MajorityElement {
    public static int findMajority(int[] nums ){
        int element = -1;
        int count = 0;
        for(int i:nums){
            if(count==0){
                element =  i;
                count++;
            }else {
                if(i == element){
                    count++;
                }
                else {
                    count--;
                }
            }
        }
        int countOfElements = 0;
        for(int i:nums){
            if(i == element){
                countOfElements++;
            }
            if (countOfElements>nums.length/2){
                return  element;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,23,4,22,1,3,1,3,1,1,1,1};
        int majority = findMajority(nums);
        System.out.println(nums);
    }
}
