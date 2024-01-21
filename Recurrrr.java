


public class Recurrrr {
   
   
   public static int recursive(int n) {
     
      int count = 0;
      
      if (count == 5 ) {
         return n;
      
      }
      else{
         if( n%3 == 0) {
            System.out.println(n);
         }
         n++;
         count++;
      }
      
      return recursive(n);
      

      
   }
   
   
   
   
   
   public static void main(String args[]) {
   recursive(30);
   
   
   }




}