package virtusa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class ArrangingMid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt(),tmp=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
                al.add(sc.nextInt());
        }
        Collections.sort(al);
        System.out.println();
        for (int i=al.indexOf(k)+1,h=n-1;i<h;i++,h--) {
            System.out.println(" "+al.get(i)+" "+al.get(h));
            tmp=al.get(h);
            al.remove(h);
            al.add(h,al.get(i));
            al.remove(i);
            al.add(i,tmp);
        }
        for(int i=0;i<n;i++)
            System.out.print(al.get(i)+" ");
    }
}
