public class exercicio5{
    public static void main (){
        for (int i = 1; i <= 100; i++){
            System.out.println(i + "\t" + f(i));
        }
    }
    public static int f( int n ) {
        int i, j, k, res = 0, cont_op = 0;
        for( i = 1; i <= n*n; i += 1 )
            for( j = 1; j <= i; j += 2 )
                for( k = n+1; k <= 2*i; k += i*j ) {
                    res = res + k+1;
                    cont_op++;
                    
                }
        return cont_op;       
    }
}
