package ArraysMedium;

public class dpOnStock {

    public static int bruteForce(int [] prices){
        int n = prices.length;
        int maxPro = 0;
        for(int i =0 ; i< n; i++){
            for(int j = i+1; j<n;j++){
                if(prices[j]>prices[i]){
                    maxPro = Math.max(prices[j] - prices[i],maxPro);
                }
            }
        }
        return maxPro;
    }

    public static int optimalApproach(int[] prices){
        int n = prices.length;
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxPro = Math.max(prices[i]- minPrice, maxPro);
        }
        return maxPro;
    }


    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int maxPro = bruteForce(arr);
        System.out.println("Max profit using brute force is: " + maxPro);

        int[] arr2 = {7,6,4,3,1};
        int maxPro2 = bruteForce(arr2);
        System.out.println("Max profit using optimal approach is: " + maxPro2);

    }
}
