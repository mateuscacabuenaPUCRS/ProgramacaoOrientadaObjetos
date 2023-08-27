public class exercicio4{
    public static void main (){
        for (int i = 1; i <= 50; i++){
            System.out.println(i + "\t" + f(i));
        }
    }
    public static int f( int n ) {
        int i, j, k, res = 0, cont_op = 0;
        for( i = n; i <= n*n; i += 2 )
            for( j = n+1; j <= n*n; j += 2 )
                for( k = j; k <= 2*j; k += 2 ) {
                    res = res + 1;
                    cont_op++;
                }
        return cont_op;
    }
}
