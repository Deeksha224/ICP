import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 7, 9};
        int[] nums2 = {2, 3, 5, 6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2 ){
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++){
            arr[nums1.length + j] = nums2[j];
        }
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0){
            return (double)(arr[n/2] + arr[(n/2) - 1]) / 2;
        }
        else{
            return arr[n/2];    
        }
    }
// optimization 
    public static double findMedianSortedArrays1(int[] a, int[] b) {
        if (a.length > b.length){
            int[] temp = a ;
            a = b; 
            b = temp;
        }

        int start = 0;
        int end = a.length;
        int total = a.length+b.length;
        int half = (total+1)/2;

        while (start <= end){
            int al = (start + end)/2; // a left
            int bl = half - al; // b left
            int alm1 = (al == 0) ? Integer.MIN_VALUE: a[al-1]; // a left min -1
            int aleft = (al == a.length) ? Integer.MAX_VALUE : a[al]; //a left
            int blm1 = (bl == 0) ? Integer.MIN_VALUE: b[bl - 1]; // b rleft min -1
            int bleft = (bl == b.length) ? Integer.MAX_VALUE : b[bl]; // b left


            if (alm1 <= bleft && blm1 <= aleft){
                double ans;
                if (total % 2 == 0){
                    ans = (Math.max(alm1,blm1) + Math.min(aleft,bleft))/2.0;
                }
                else{
                    ans = Math.max(alm1,blm1)/1.0;
                }
                return ans;
            }
            else if (alm1 > bleft) {
                end = al - 1;   // move left
            }
            else {
                start = al + 1; // move right
            }

        } 
        return -1;
    }
}
