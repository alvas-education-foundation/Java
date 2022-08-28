//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    import java.util.Map.Entry;
    
    class GFG {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                Solution g = new Solution();
                ArrayList<Integer> ans = g.duplicates(a, n);
                for (Integer val : ans) System.out.print(val + " ");
                System.out.println();
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public static ArrayList<Integer> duplicates(int arr[], int n) {
            // code here
             //int n=sc.nextInt();
            ArrayList<Integer> al1=new ArrayList<>();
            ArrayList<Integer>al2=new ArrayList<>();

            for (int i = 0; i <n; i++) {
                //int e=sc.nextInt();
                boolean al3=(al1.contains(arr[i])&&!al2.contains(arr[i]))?al2.add(arr[i]):al1.add(arr[i]);
            }
            if(al2.isEmpty()){
                al2.add(-1);
                return al2;
            }
            else{
                Collections.sort(al2);
                return al2;
            }
        }
    }
    