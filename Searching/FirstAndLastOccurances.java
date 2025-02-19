/* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ (leetcode 34)*/
/* The approach of this problem is to apply binary search two times one for first occurance and 
one for last occurance*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        int first = search(nums,target,true);
        int last = search(nums,target,false);
        arr[0] = first;
        arr[1] = last;

        return arr;//Always try to put pen on a paper and solve it by your intution
    }

    int search(int[] nums,int target,boolean findFirstOccurance)

    {
            int start = 0;
            int end = nums.length-1;
            int ans = -1;
            while(start<=end)
            {
                
                int mid = start+(end-start)/2;
                if(nums[mid]<target)
                {
                    start = mid+1;
                }

                else if(nums[mid]>target)
                {
                    end = mid-1;
                }

                else
                {
                    ans = mid;
                    if(findFirstOccurance)
                    {
                        end = mid-1;
                    }

                    else
                    {
                        start = mid+1;
                    }
                }            
            }
            return ans;
    }
}
