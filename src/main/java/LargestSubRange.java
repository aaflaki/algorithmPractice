public class LargestSubRange {

    private static int maxLeftMidSum(int[] arr, int l, int m) {
        int sum = 0;
        int bestSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += arr[i];
            if (bestSum < sum)
                bestSum = sum;
        }
        System.out.println("maxLeftMidSum(l=" + l + ", m=" + m + ") = " + bestSum);
        return bestSum;
    }
    private static int maxMidRightSum(int[] arr, int m, int h) {
        int sum = 0;
        int bestSum = Integer.MIN_VALUE;
        for (int i = m; i <= h; i++) {
            sum += arr[i];
            if (bestSum < sum)
                bestSum = sum;
        }
        System.out.println("maxMidRightSum(m=" + m + ", h=" + h + ") = " + bestSum);
        return bestSum;
    }
    private static int largestSubRagne(int[] arr, int l, int h){
        if (l == h) return arr[l];
        int m = (l+h) / 2;
        int maxLeftMidSum;
        if (l==m)
            maxLeftMidSum = arr[l];
        else
            maxLeftMidSum = maxLeftMidSum(arr,l,m);
        int maxMidRightSum;
        if (m+1 == h)
            maxMidRightSum = arr[h];
        else
            maxMidRightSum = maxMidRightSum(arr, m + 1, h);
        int maxMidSum = Math.max(Math.max(maxLeftMidSum, maxMidRightSum), (maxLeftMidSum + maxMidRightSum));
        return Math.max(Math.max(largestSubRagne(arr, l, m), largestSubRagne(arr, m + 1, h)),
                maxMidSum);
    }

    public static void main(String[] args) {
        int[] arr = {-17, 5, 3, -10 , 6, 1, 4, -3, 8, 1, -13, 4};
        System.out.println(largestSubRagne(arr, 0, arr.length-1));
    }
}
