import java.util.*;
import java.io.*;

class Solution{
    public static void querySeries(){
        
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int tmp=0;
            int sum=0;
            for(int k=0;k<n;k++){ 
                while (tmp<k) {
                    sum+=(int) (Math.pow(2,k)*b);
                    k++;
                }
                int exp=a+sum;
                System.out.println(exp+"");
            }
        }   
        in.close();
    }
}
