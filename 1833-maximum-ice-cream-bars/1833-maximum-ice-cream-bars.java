class Solution {

    public static void countSort(int[] c) {
        int max = c[0];

        for (int i = 1; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
        }

        int[] newc = new int[max + 1];
        for (int num : c) {
            newc[num]++;
        }
 int index = 0;
        for (int i = 0; i < newc.length; i++) {
           

            while (newc[i] > 0) {
                c[index] = i;
                index++;
                newc[i]--;
            }
        }

    }

    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length ;

        countSort(costs);
        int icescreem = 0;
        for (int i = 0; i < n; i++) {
            if (coins >= costs[i]) {
                coins -=costs[i];
                icescreem++;
            } else {
                break;
            }
        }
        return icescreem;
    }
}