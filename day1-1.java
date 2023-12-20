class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int f= 0;
        int l= arr.length-1;
        
        if(arr[l]==0){
            return -1;
        } else if(arr[f]==1) {
            return 0;
        }
        
        while(f<=l){
            int m = (f+l)/2;
            if(arr[m]==1 && arr[m-1]!=1){
                return m;
            } else if(arr[m] == 0) {
                f=m+1;
            } else {
                l = m-1;
            }
        }
        return l;
    }
}
