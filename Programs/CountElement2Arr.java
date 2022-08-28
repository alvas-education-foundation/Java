/*
 Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates.
  For each element in arr1[] count elements less than or equal to it in array arr2[].
*/

//{ Driver Code Starts
    import java.util.*;

    class Count
    {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int m = sc.nextInt();
                int n = sc.nextInt();
                
                int arr1[] = new int[m];
                int arr2[] = new int[n];
                
                for(int i = 0; i < m; i++)
                  arr1[i] = sc.nextInt();
                  
                for(int i = 0; i < n; i++)
                  arr2[i] = sc.nextInt();
                  
                Solution gfg = new Solution();
                ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
                for (int i = 0; i < res.size(); i++)
                    System.out.print (res.get (i) + " ");
                System.out.println();
            }
            
        }
    }
    // } Driver Code Ends
    
    
    // Complete the function given below
    class Solution
    {
        public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
        {
           // add your code here
          ArrayList<Integer>al=new ArrayList();
          int c=0;
          for(int i=0,j=0;i<m||j<n;i++,j++){
                if(arr2[j]<=arr1[i]){
                    c++; 
                    al.add(c);
                    c=0;
                }
                return al;
            }
        return al;
        }
    }