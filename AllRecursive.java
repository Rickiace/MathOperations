/**
 * AllRecursive -- This is a class that contains main that executes recursive menu method that contains other methods to execute 
                   based on user selection 
 * @author    Ricki Ace Gaborno
 */
import java.util.Scanner;


//class
public class AllRecursive {

   //main 
   public static void main(String args[]) {
      int h = foo(2);
      System.out.println(h);
      menu();
   }   
      
      
      //menu method that asks user to choose an operation that calls onto other methods
      public static void menu()  {
         Scanner scnr = new Scanner(System.in);
         int userChoice = 0;
         int x = 0;
         int y = 0;
         
         scnr = new Scanner(System.in);
         
         
         System.out.println("Menu");
         System.out.println("1. power(int,int);");
         System.out.println("2. decrease (int);");
         System.out.println("3. summation (int)");
         System.out.println("0. Exit");
         System.out.println("Please Select The Number With The Option You Want To Execute");
       
         
         try {
            scnr = new Scanner(System.in);
            userChoice = scnr.nextInt();
         }
         catch (Exception e) {
            System.out.println("You didn't choose a number between");
            userChoice = 5;
            menu();
         }
         
         if (userChoice <= -1 || userChoice >= 4) {
            System.out.println("Please choose a number between 0 to 3");
            menu();
         }
         
         if (userChoice == 0 ) {
            System.out.print("Thank you");
            System.exit(0);
         }
   
   
   
         switch(userChoice){
         
            //Case 1 calls on the power method which will ask for a base number to increase the power of the next inputte number
            case 1:   
            
               
               System.out.println("Choose a number to elevate");
               try {
                  scnr = new Scanner(System.in);
                  x = scnr.nextInt();
               }
               catch (Exception e) {
                  System.out.println("You didn't choose a number");
                  menu();
               }
               
               if (x < 0 ) {
                  System.out.println("Choose a positive number");
                  menu();
               }
               
               System.out.println("Choose a number to to elevate it by");
               try {
                  scnr = new Scanner(System.in);
                  y = scnr.nextInt();
               }
               catch (Exception e) {
                  System.out.println("You didn't choose a number");
                  menu();
               }
               
               if (y < 0 ) {
                  System.out.println("Choose a positive number");
                  menu();
               }
               
               int result = power(x,y);
               
               System.out.println( x + "^" + y + "=" + result);
               
               scnr = new Scanner(System.in);
               menu();
         
            //Case 2 calls upon decrease method which prints from the number selected counting down
            case 2:
               
               System.out.println("choose a number you want to decrease");
            
               try {
                  scnr = new Scanner(System.in);
                  x = scnr.nextInt();
               }
               catch (Exception e) {
                  System.out.println("You didn't choose a number");
                  menu();
               }
               
               if (x < 0 ) {
                  System.out.println("Choose a positive number");
                  menu();
               }
               
               decrease(x);
               scnr = new Scanner(System.in);
               menu();

           
           //Case 3 calls upon summation method that adds selected number to one lower of that number until 0 thne prins results
            case 3:
            
               System.out.println("Choose a number you want the summation for");
               
               try {
                  scnr = new Scanner(System.in);
                  x = scnr.nextInt();
               }
               catch (Exception e) {
                  System.out.println("You didn't choose a number");
                  menu();
               }
               
               if (x < 0 ) {
                  System.out.println("Choose a positive number");
                  menu();
               }
            
               int sum = summation(x);
               System.out.println(sum);
               
               
               
  
  
  
  


               
         }
         menu();
         
      }
   
   
   
   
   
   
   
   
   
   
      public static int power (int x, int y) {
         if ( y != 0) {
            
            return ( x * power( x , y - 1));
         }
         else {
            return 1;
         }
      }
      
      public static void decrease ( int one ) {

         if ( one == 0 ) {
            System.out.println("0");
         }
         else {
            System.out.println( one );
            one--;
            decrease(one);
         }    
         
      
      
      
      }
      
      
      
      public static int summation (int one) {
      
         if (one == 0) {
            return 0;
         }
         if (one==1){
            return 1;
         }
         
         else {
            return summation(one - 1) + one;
         }
      
      }
      
      
      public static int foo ( int n) {
         if (n == 0) {
            return 5;
         }
         else {
         int h = 7 + foo(n-1);
         System.out.println(h);
         return 7 + foo(n-1);
         }
      
      
      }
      
      
      

      
      
      
      
      
      
}


      
      
      
      