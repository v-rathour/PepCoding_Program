import java.util.*;
  
  public class AnyBaseToDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int sum=0;
      int i=0;
      while(n!=0){
          int rem=n%10;
          sum=sum+(int)Math.pow(b,i)*rem;
          i++;
          n /=10;
      }
      return sum;
      
   }
  }
