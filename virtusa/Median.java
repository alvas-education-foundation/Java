package virtusa;
import java.lang.reflect.Array;
import java.util.*;
public class Median {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //c=0,d=0;

    /////////using array ain't possible
    //     int []a=new int[n];
    //     int []b=new int[n];
    //     for(int i=0;i<n;i++){
    //         a[i]=sc.nextInt();
    //         c++;
    //         if(c>1){
    //             //Arrays.sort(a);
    //             int j=0;
    //             if(c%2==0){
    //                 d=c/2;
    //                 j=d-1;
    //                 // System.out.println(" "+d +" "+j );
    //                 // System.out.println(" "+a[d] +" "+a[j] );
    //                 b[i]=(int) Math.floor((a[d]+a[j])/c);
    //                 // System.out.println(b[i]+" even\t");
    //             }
    //             else{
    //                 d=(c/2);
    //                 // System.out.println(" "+d+" ");
    //                 // System.out.println(" "+j +" ");
    //                 b[i]=(int)Math.floor(a[d]/c);
    //                 // System.out.println(b[i]+" odd\t");
    //             }
    //         }
    //         else
    //             b[i]=a[i];
    //     }
    //     for(int k=0;k<n;k++){
    //         System.out.print(b[k]+"\t");
    //     }
    

    //Using Collection
    ArrayList <Integer>al1=new ArrayList<>();
    ArrayList<Integer>al2=new ArrayList<>();
    for(int i=0;i<n;i++){
        al1.add(sc.nextInt());
        Collections.sort(al1);
        int ptr=al1.size();
        if(ptr%2==0){
            al2.add((al1.get(al1.size()/2)+al1.get(al1.size()/2-1))/2);
        }else{
            al2.add(al1.get(al1.size()/2));
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(al2.get(i)+"\t");
    }
    }

}
