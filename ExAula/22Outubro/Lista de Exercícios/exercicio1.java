public class exercicio1

{
    public static void main (String[] args) {
        for (int i=1; i<=100; i++) {
            System.out.println(i + "\t" + f(i));
        }
    }
    public static int f( int n ) {
        int i, j, k, res = 0, cont_op = 0;
        for(i=1; i<=n+1; i+=1)
            for(j=1; j<=i*i; j+=i+1)
                for(k=i/2; k<=n+j; k+=2) {
                    res = res + n-1;
                    cont_op++;
                }
        return cont_op;
    }
}
