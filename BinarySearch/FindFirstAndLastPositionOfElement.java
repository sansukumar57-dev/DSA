package DSA.BinarySearch;

class FindFirstAndLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int second=-1;

        first=helperfirst(nums,target);
        second=helpersecond(nums,target);
        return new int[]{first,second};
    }

    public int helperfirst(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;

            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
     public int helpersecond(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
                System.out.println(ans +"jjj");
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}