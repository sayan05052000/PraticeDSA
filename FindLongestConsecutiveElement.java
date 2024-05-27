package sorting.questions;

public class FindLongestConsecutiveElement {

    public static int longestConsecutive(int[] nums) {
        //sort the array in descending order
        mergeSort(nums,0,nums.length-1);
        int count = 0;
        int maxCount = 0;
        for(int i = 1;i<nums.length;i++){
            //check if i-1 is less than i by 1
            //if true then increase the count and compare with maxCount
            //if i-1 equal to i then do nothing
            //else initialize the counter to zero
            if(nums[i-1] == nums[i]-1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else if(nums[i-1] == nums[i]){

            }else{
                count = 0;
            }
        }
        //if the array is empty return 0
        if(nums.length == 0)
            return maxCount;
        //else return maxCount+1 as we are skipping the element from where the counter is starting
        return maxCount+1;
    }

    public static void mergeSort(int[] n,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(n,low,mid);
            mergeSort(n,mid+1,high);
            merge(n,low,mid,high);
        }
    }
    public static void merge(int[] n,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int[] newArr = new int[high-low+1];
        int k = 0;
        while(i<=mid && j<=high){
            if(n[i]<n[j]){
                newArr[k++] = n[i++];
            }else{
                newArr[k++] = n[j++];
            }
        }
        while(i<=mid){
            newArr[k++] = n[i++];
        }
        while(j<=high){
            newArr[k++] = n[j++];
        }
        for(int k1=0;k1<newArr.length;k1++){
            n[low+k1] = newArr[k1];
        }
    }

    public static void main(String[] args) {
        int[] n = {100,4,200,3,2,1};
        int count = longestConsecutive(n);
        System.out.println(count);
    }
}
