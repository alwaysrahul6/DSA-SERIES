package BINARY_SEARCH;
/*      *   https://www.geeksforgeeks.org/problems/koko-eating-bananas/1
        *   Koko Eating Bananas
        *   Koko is given an array arr[], where each element represents a pile of bananas. She has exactly k hours to eat all the bananas.
        *   Each hour, Koko can choose one pile and eat up to s bananas from it.
        *   If the pile has atleast s bananas, she eats exactly s bananas.
        *   If the pile has fewer than s bananas, she eats the entire pile in that hour.
        *   Koko can only eat from one pile per hour.
        *   Your task is to find the minimum value of s (bananas per hour) such that Koko can finish all the piles within k hours.
        *   Examples:
        *   Input: arr[] = [5, 10, 3], k = 4
        *   Output: 5
        *   Explanation: Koko eats at least 5 bananas per hour to finish all piles within 4 hours,
        *                as she can consume each pile in 1 + 2 + 1 = 4 hours.*/
import java.util.Scanner;

public class Searchig_KoKo_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element: ");
        String[] s = scanner.nextLine().split(" ");
        int n = s.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter hours");
        int h = scanner.nextInt();
        System.out.println(linearly(arr, h));
    }

    static int maxi(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    /// calculate the total hours to requird
    static int calculatho(int arr[], int hours) {
        int totalhours = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalhours += (int) Math.ceil((double) arr[i] / hours);
        }
        return totalhours;
    }

    /// min time

    public static int kokoEat(int[] arr, int k) {
        // code here
        int low = 1, high = maxi(arr);
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalhours = calculatho(arr, mid);
            if (totalhours <= k) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    /// linear search

    static int linearly(int arr[], int hours) {
        int n = arr.length;
        int totalhours = 0;
        for (int i = 1; i < maxi(arr); i++) {
            totalhours = calculatho(arr, i);
            if (totalhours <= hours) return i;
        }
        return -1;
    }
}
