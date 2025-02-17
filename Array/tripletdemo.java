package ARRAYS;
import java.util.Scanner;

public class tripletdemo {



        public static int TripletSum(int arr[], int target) {
            int ans = 0;
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == target) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of Array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " Element");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter Target Sum");
            int target = sc.nextInt();
            System.out.println(TripletSum(arr, target));
        }
    }

