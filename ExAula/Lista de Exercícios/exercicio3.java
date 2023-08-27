public class exercicio3{
    public static void main (){
        for (int i = 1; i <= 100; i++){
            System.out.println(i + "\t" + f(i));
        }
    }
    public static int f( int n ) {
        int i, j, k, res = 0, cont_op = 0;
        for( i = 1; i <= n*n; i += 2 )
            for( j = i/2; j <= 2*i; j += i/2+1 )
                for( k = j+1; k <= n+j; k += k/2+1 ) {
                    res = res + (j-i);
                    cont_op++;
                }
        return cont_op;
    }
}
