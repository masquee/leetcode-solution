
public class Solution121 {


    // brute-force
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        if (prices.length == 1) return 0;

        int length = prices.length;     // length > 1

        int max = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                int tmp = prices[j] - prices[i];
                if (tmp > max) max = tmp;
            }
        }
        return max;
    }

}
