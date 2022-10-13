import java.util.*;
  
  public class Base_Addition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int ans=0;
       int i=1;
       int cary=0;
       while(n1>0  || n2>0 || cary>0){
           int rem1=n1%10;
           int rem2=n2%10;
           int sum=rem1+rem2+cary;
           cary=sum/b;
           sum=sum%b;
           ans +=sum*i;
           n1 /=10;
           n2 /=10;
           i *=10;
       }
       return ans;
   }
  }
