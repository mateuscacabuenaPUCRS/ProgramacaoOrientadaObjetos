import java.util.Scanner;
public class teste
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        int n;
        do{
        n = in.nextInt();
        in.nextLine();
        if(n <= 1){
            System.out.println("1");
        }
        else{
            int nn = n-1 + n-2;
            System.out.println(nn);
        }
        }
        while(n != -1);
    }
}
