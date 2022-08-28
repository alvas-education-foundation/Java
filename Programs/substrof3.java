    package HackerRank;

    import java.io.*;
    import java.util.Scanner;
    import java.util.*;

    public class substrof3 {
    public static String getSmallestAndLargest(String s, int k) {
            //String smallest = "";
            String largest = "";
        //welcome largest=smallest="";
            String[] a=new String[s.length()-(k-1)];
            for(int i=0;i<a.length;i++){
                a[i]=s.substring(i,i+k);
            }
            //Arrays.sort(a);
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>0){
                    largest=a[i];
                    a[i]=a[j];
                    a[j]=largest;
                }
            }
            }
            // smallest=a[0];
            // largest=a[a.length-1]
            return a[0] + "\n" + a[a.length-1];
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();
        
            System.out.println(getSmallestAndLargest(s, k));

        }
    }
