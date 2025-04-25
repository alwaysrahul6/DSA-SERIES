package GFG_160_SERIES;
/*   * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/allocate-minimum-number-of-pages0937
     * Q-Allocate Minimum Pages
     * You are given an array arr[] of integers, where each element arr[i] represents the number of pages in the ith book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:
     * Each student receives atleast one book.
     * Each student is assigned a contiguous sequence of books.
     * No book is assigned to more than one student.
     * The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.
     * Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).
     * Examples:
     * Input: arr[] = [12, 34, 67, 90], k = 2
     * Output: 113
     * Explanation: Allocation can be done in following ways:
     * [12] and [34, 67, 90] Maximum Pages = 191
     * [12, 34] and [67, 90] Maximum Pages = 157
     * [12, 34, 67] and [90] Maximum Pages = 113.
     * Therefore, the minimum of these cases is 113, which is selected as the output.*/


import java.util.Scanner;

public class GFG_34_Allocate_Minimum_Pages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of books");
        int book  = scanner.nextInt();
        System.out.println("Enter Books");
        int [] books = new int[book];
        for (int i = 0 ; i< book;i++){
            books[i] = scanner.nextInt();
        }
        System.out.println("Enter Number of Student :");
        int student = scanner.nextInt();
        System.out.println(allocation(books,student));
    }
    static int allocation(int arr[] , int k){
        if (k>arr.length)return -1;
        int start = 0, end =0, ans = -1 , mid;
        /// Store the max in start and sum of array in end
        for (int value : arr) {
            start = Math.max(start, value);
            end += value;
        }
        while (start<=end){
            mid = start + (end - start)/2;
            int pages = 0 , count =1;
            for (int j : arr) {
                pages += j;
                if (pages > mid) {
                    count++;
                    pages = j;
                }
            }
            if (count<=k){
                ans = mid;
                end = mid-1;
            }else
                start = mid + 1;
        }
        return ans;
    }
}
