import java.util.Scanner;
public class exercicio6
{
    public static void main (String[] args){
        System.out.println("\f");
        for(int i = 0 ; i <= 30; i++){
            System.out.println(i + "\t" + f(i,1) + "\t" + cont_op);
            cont_op = 0;
         }
     }
 
    private static int cont_op = 0;
    public static int f (int n , int d){
        if(n < 0){
            cont_op++;
            return d;
        }
        return f(n -1 , 1 - d ) + f (n -2 , d );
    }
}