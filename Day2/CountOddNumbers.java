class Solution{
    public int countOdd(int[] arr, int n) {
       int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2!=0){
         count++;
            }
            
        }
     return count;  
    }
 public static void main(String[] args)
{
    Solution s = new Solution();
   
   int[] arr={1,2,4,5};
   System.out.println("odd no" + s.countOdd(arr,arr.length));

} 
 }
