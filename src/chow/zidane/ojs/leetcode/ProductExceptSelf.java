package chow.zidane.ojs.leetcode;

public class ProductExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[nums.length];
        for(int i = 0;i<n;i++){
            output[i] = 1;
        }
        for (int i = 1;i<n;i++){
            output[i] = nums[i-1] * output[i-1]; 
        }
        int tmp = 1;
        for(int i = n-1;i>=0;i--){
            output[i] = output[i] * tmp;
            tmp = tmp*nums[i];
        }
        return output;
	}
}
