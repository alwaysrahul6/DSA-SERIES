/*
* Container With Most Water
 Given an array arr[] of non-negative integers, where each element arr[i]
  represents the height of the vertical lines, find the
  maximum amount of water that can be contained between any two lines,
  together with the x-axis.
 Examples:
Input: arr[] = [1, 5, 4, 3]
Output: 6
Explanation: 5 and 3 are 2 distance apart. So the size of the base is 2.
* Height of container = min(5, 3) = 3. So, total area to hold water = 3 * 2 = 6.*/
    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int ans = 0;
        while (l < r) {
            int h = Math.min(arr[l], arr[r]);
            int width = r - l;
            int area = h * width;
            ans = Math.max(ans, area);
            if (arr[l] < arr[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
 public static void main(String[] args) {
       int arr[] = {1, 5, 4, 3};
        System.out.println(maxWater(arr));
    }
