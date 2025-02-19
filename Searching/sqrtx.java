/*https://leetcode.com/problems/sqrtx/(leetcode 69)*/

class Solution {
    public int mySqrt(int x) {
        //this question is just same as coins and traingles in codechef question
        int start = 0;
        int end = x;
        int ans = 0;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            long mult = (long) mid*mid;

            if(mult<=x)//this is where i got first error as i need to compare it 
                        //with x not end
            {
                ans = mid;
                start = mid+1;
            }
            
            else
            {
                end = mid-1;
            }
        }

        return ans;



    }
}
