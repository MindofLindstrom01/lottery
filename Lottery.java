/*******************************************************************************************************
 *Austin Lindstrom
 * 10/30/19
 * Lottery.java
 * Takes 4 random integers and 4 user input numbers and runs them through a sequence of conditionals
 * and loops to see how much the user has won in the lottery based on how many matching numbers
 * are acquired                                                                      
 *******************************************************************************************************/


import java.util.*;    //imports Scanner class and Random class


public class Lottery
{
  public static void main(String[]args)
  {
 

    
int r1, r2, r3, r4, u1, u2, u3, u4, count=0;    //variables used for random generated numbers and user input numbers and counting the number of matching numbers
   



Scanner scan = new Scanner(System.in);    
Random generator = new Random();






r1 = generator.nextInt(54) + 1;
r2 = generator.nextInt(54) + 1;
r3 = generator.nextInt(54) + 1;          //Generates 4 random numbers (1-54)
r4 = generator.nextInt(54) + 1;





while (r1==r2||r1==r3||r1==r4)
 {
  r1 = generator.nextInt(54) + 1;
  }
 
while (r2==r1||r2==r3||r2==r4)
 {
  r2 = generator.nextInt(54) + 1;
  }

while (r3==r1||r3==r2||r3==r4)
 {
  r3 = generator.nextInt(54) + 1;                                 //Tells the program that if any duplicate random integers                                                                                 //are detected then it will come up with a new number
  }                                                                               //are found then generate a new random number until there are no more duplicates

while (r4==r1||r4==r2||r4==r3)
 {
  r4 = generator.nextInt(54) + 1;
  }





System.out.println("Please enter a number ranging from 1-54");                  //Prompts the user for a number 1-54 and scans for user input
  u1=scan.nextInt();  
 
  while (u1<1||u1>54)      //Makes sure that the user cannot enter an invalid number
  {
    System.out.println("Please enter a valid number within the given range(1-54)");          
     u1=scan.nextInt();
  }

System.out.println("Please enter a number ranging from 1-54");
  u2=scan.nextInt();  
 
   while (u2==u1)          //Makes sure that the user cannot enter a Duplicate number
   {
     System.out.println("Please enter a non-duplicate number");
     u2=scan.nextInt();
   }
   while (u2<1||u2>54)
  {
    System.out.println("Please enter a valid number within the given range(1-54)");
     u2=scan.nextInt();
  }

   
System.out.println("Please enter a number ranging from 1-54");
  u3=scan.nextInt();  
 
   while (u3==u1||u3==u2)
   {
     System.out.println("Please enter a non-duplicate number");
     u3=scan.nextInt();
   }
   while (u3<1||u3>54)
  {
    System.out.println("Please enter a valid number within the given range(1-54)");
     u3=scan.nextInt();
   }

   
System.out.println("Please enter a number ranging from 1-54");
  u4=scan.nextInt();
   
   while (u4==u1||u4==u2||u4==u3)
   {
      System.out.println("Please enter a non-duplicate number");
     u4=scan.nextInt();
   }
   while (u4<1||u4>54)
  {
    System.out.println("Please enter a valid number within the given range(1-54)");
     u4=scan.nextInt();
  }

   

   
   
   
if (u1==r1||u1==r2||u1==r3||u1==r4)
    count++;

if (u2==r1||u2==r2||u2==r3||u2==r4)
    count++;

if (u3==r1||u3==r2||u3==r3||u3==r4)           //Raises the variable count each time a match of numbers is established
    count++;

if (u4==r1||u4==r2||u4==r3||u4==r4)
    count++;









if (count==0)
{
  System.out.println("Sorry, you have 0 matching numbers- $0");
}

if (count==1)
{
  System.out.println("Congratulations, you have 1 matching number- Free Ticket!");
}
if (count==2)
{
  System.out.println("Congratulations, you have 2 matching numbers- $25");
}

if (count==3)
{
  System.out.println("Congratulations, you have 3 matching numbers- $1000");                 //Prompts the user with a printout statement of their winnings based on
}                                                                                                                                           //what integer the variable "count" ended up with

if (count==4)
{
  System.out.println("Congratulations, you have 4 matching numbers- $75,000");
}




scan.close(); //closes the scanner object

System.exit(0); //terminates the program
  
  }
}




