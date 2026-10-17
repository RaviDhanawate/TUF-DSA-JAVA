// TUF 886. Sum of Array Elements
public class SumOfArray {
    // Method for TUF
    public int sum(int arr[], int n) {
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }

    // For testing locally
    public static void main(String[] args) {
        SumOfArray sol = new SumOfArray();
        int[] arr = {1,2,3,4,5};
        System.out.println(sol.sum(arr, arr.length)); // 15
    }
}
