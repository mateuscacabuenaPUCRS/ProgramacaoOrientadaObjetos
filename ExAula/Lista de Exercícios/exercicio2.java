public class exercicio2{
    public static void main (String[] args){
        for (int i = 2; i <= 100; i++){
            System.out.println(i + "\t" + f(i));
        }
    }
    public static int f( int n ) {
        int i, j, k, res = 0, cont_op = 0;
        for( i = n/2; i <= n; i += i )
            for( j = n+1; j <= 2*i; j += 2 )
                for( k = j/2; k <= n*i; k += k/2+1 ) {
                    res = res + 2*n;
                    cont_op++;
                }
        return cont_op;
    }
}
