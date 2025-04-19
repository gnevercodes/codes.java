package DataStructuresHeadfirst;

public class selectionsort 
{
    public static void main(String[] args) {
        
        int[] nums = { 2,5,33, 9 , 99 , 66 } ; 

        int size = nums.length ;
        int temp  = 0 ; 
        int minIndex = -1 ; 
        System.out.print("before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        for( int i = 0 ; i < size-1 ; i ++ ){
            for( int j = i + 1 ; j < size ; j++  ){
                if( nums[minIndex] > nums[j]) {
                    minIndex = j ; 
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i] ; 
            nums[i] = temp ;  
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums ){
            System.out.print(num + " "); 
        }
    }
}
