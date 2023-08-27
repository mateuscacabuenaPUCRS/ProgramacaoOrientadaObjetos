public class exercicio6Rascunho{
    public static void main (){
        int d = 1;
        for (int i = 1; i <= 30; i++){
            int cont_op = 0;
            f(i, 1);
            System.out.println(i + "\t" + cont_op);
        }
    }
    public static int f (int n , int d) {
        int cont_op=0;
        cont_op++;
        if( n < 0 ) {
            return cont_op;
        }
        return cont_op;        
    }
}