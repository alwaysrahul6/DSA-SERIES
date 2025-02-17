package ARRAYS;

public class StockBuySell {
    public static int stock(int prices[]){
        int n = prices.length,sum =0;
        for (int  i=1;i<n;i++){
            if (prices[i] >prices[i-1]){
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 100,180,240,560,45,698};
        System.out.println(stock(arr));
    }
}
