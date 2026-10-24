class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
    
      for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
            {
                return false;  
            }
            
        }
     return true;
    }
 public static void main(String[] args)
{
    Solution s=new Solution();
   
   int[] arr={1,2,3,4,5};
   System.out.println("Sorted array"+s.arraySortedOrNot(arr,arr.length));

} 
 }
       
