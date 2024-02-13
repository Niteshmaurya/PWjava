public class L49Q2 {
    public static void main(String[] args) {
        int t = 26;
        System.out.println("sqrt is " + getSqrtOpti(t));
    }

    static int getSqrt(int t) { // this is linear search time complexity will be O(sqrt(i))
        int i = 1;
        while (i * i <= t) {
            i++;
        }
        return i - 1;
    }

    static int getSqrtOpti(int t) {
        int l = 0;
        int r = t;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = mid * mid;
            if (val == t)
                return mid;
            else if (val < t) {
                l = mid + 1;
                ans = mid;
            } else if (val > t)
                r = mid - 1;
        }
        return ans;
    }
}
