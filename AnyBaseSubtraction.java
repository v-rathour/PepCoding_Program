import java.util.*;
  
  public class AnyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int c=0;
       int ans=0;
       int i=1;
       while(n2>0){
           int rem1=n1%10;
           int rem2=n2%10;
           n1 /=10;
           n2 /=10;
           
           int sum=0;
           rem2 =rem2+c;
           if(rem2>=rem1){
               c=0;
               sum=rem2-rem1;
           }
           else{
               c=-1;
               sum=rem2+b-rem1;
           }
           ans +=sum*i;
           i *=10;
         }
        return ans; 
   }
  
  }
