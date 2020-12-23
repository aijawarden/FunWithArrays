public class FunWithArrays
{

   public static void fillArray( int[] a )
   {
      for( int i = 0; i < a.length; i++ )
      {
         a[i] = 25;
      }
   }
   
   
   public static void printArray( int[] )
   {
      for( int i = 0; i < a.length; i++ )
      {
        System.out.println( i + ": " + a[i] );
      }
   }
   
   
   public static void main(String[] args)
   {
      int[] nums = { 22, 92, 57, 18 };
      int[] nums1 = { 44, 23, 89 };
      
      int sum = 0;
      
      printArray( nums );
      printArray( nums1 );
      
      // sum array elements
      for( int i = 0; i < nums.length; i++ )
      {
         sum = sum + nums[i];
      }
      System.out.println( "sum: " + sum );
      
      sum = 0;
      for( int i = 0; i < nums.length; i++ )
      {
         sum = sum + nums[i];
      }
      System.out.println( "average: " + sum / nums.length );
      
/*
      for( int i = 0; i < nums.length; i++ )
      {
         nums [i] = 25;
      }
*/
      
      fillArray( nums );
      
      for( int i = 0; i < nums.length; i++ )
      {
         System.out.println( i + ": " + nums[i] );
      }



   }
}
  