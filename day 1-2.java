class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int f=0;
        int l = n-1;
        while(f<=l){
            int m = (f+l)/2;
            if(arr[m]==k){
                return m;
            } else if(arr[m]>k) {
                l = m-1;
            } else {
                f = m+1;
            }
        }
        return -1;
    }
}
