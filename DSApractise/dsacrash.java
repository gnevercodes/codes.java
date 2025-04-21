public class dsacrash {
    public static void main(String[] args) {
        
        int nums[] = { 1,2,3,4,5,9}; 
        int target = 9; 
        int result1  = BinearSearch(nums , target);
        int result2  = BinearSearch(nums , target);
        
        if(result1!=-1){

        
        System.out.println("element found at index" + result1 );
        }
        else 
        System.out.println("element not found ");
            }
        
        private static int linearSearch(int[] nums, int target) {
               
            for(int i=0 ; i < nums.length ; i++ ){
                  if(nums[i] == target)
                  {
                    return i ; 
                  }
            }
               return -1; 
            }
            private static int BinearSearch(int[] nums, int target) {
            int left = 0 ; 
            int right = nums.length-1; 
            
            while(left <= right){
                int mid = (left + right)/2 ; 
                if(nums[mid]==target)
                {
                    return mid; 
                }
                else if(nums[mid] < target )
                {
                    left = mid + 1 ; 

                }
                else {
                    right = mid - 1 ;

                }
            }

            return -1; 
        
            
    

}}
