package chow.zidane.ojs.leetcode;

class SearchInRotatedSortedArrayWithDuplicates {

    static boolean search(final int[] nums, final int target) {
        if (nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;

            if (nums[mid] < nums[right]) {
                if (target <= nums[right] && target > nums[mid]) left = mid + 1;
                else right = mid - 1;
            } else if (nums[mid] > nums[right]) {
                if (target >= nums[left] && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                right --;
            }
        }
        return false;
    }

}
