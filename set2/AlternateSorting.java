package set2;

import java.util.*;

class AlternateSorting {
    public static void main(String[] args) {
        Integer[] nums={1,3,4,2,7,6,5};
        int n=nums.length;
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
        int[] ans = new int[n];
        int i=0,j=n-1,k=0;
        while(n>k){
            if(k%2==0){
                ans[k]=nums[i++];
            }else ans[k]=nums[j--];
            k++;
        }
        System.out.println(Arrays.toString(ans));
    }
    private static void swap(Integer[] nums, int i, int j){
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] -= nums[j];
    }
}
