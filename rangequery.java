public class rangequery{ 
    static int i = 4;
    static int j = 10000; 
    static long a[][] = new long[j][i + 1]; 
    static void buildSparseTable(int a1[], int n) 
    { 
        for (int m = 0; m < n; m++) 
            a[i][0] = a1[i]; 
        for (int j = 1; j <= i; j++) 
            for (int i = 0; i <= n - (1 << j); i++) 
                a[i][j] = a[i][j - 1] + a[i + (1 << (j - 1))][j - 1]; 
    } 
    static long query(int L, int R) 
    {
        long ans = 0; 
        for (int j = i; j >= 0; j--)  
        { 
            if (L + (1 << j) - 1 <= R)  
            { 
                ans = ans + a[L][j];
                L += 1 << j; 
            } 
        } 
        return ans; 
    }
    public static void main(String args[]) 
    { 
        int ar[] = { 1,3,5,7,9}; 
        int n = ar.length; 
        buildSparseTable(ar, n); 
        System.out.println(query(0, 2)); 
        System.out.println(query(3, 4)); 
        System.out.println(query(5, 6)); 
    } 
}
