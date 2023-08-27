
public class Main {
 public static void main(String args[]) {
     Agenda ag = new Agenda();
     ag.criaPessoa("Pedro",1998);
     ag.criaPessoa("Maria",2000);
     ag.criaPessoa("Joao",1999);
     Pessoa p = ag.pesquisaPessoa(2000);
     System.out.print("Dados de pessoa - nome: "+p.getNome());
     System.out.println(", Ano de nascimento: "+p.getAnoNascimento());
     p = ag.pesquisaPessoa(2001);
     System.out.print("Dados de pessoa - nome: "+p.getNome());
     System.out.println(", Ano de nascimento: "+p.getAnoNascimento());
 }
}
