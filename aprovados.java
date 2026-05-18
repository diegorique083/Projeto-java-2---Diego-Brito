import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double media = 0;

        System.out.println("Digite o número de alunos que vão rodar no programa: ");
        int n = sc.nextInt();
        sc.nextLine();

        String [] nomes = new String[n];
        double [] notaUm = new double[n];
        double [] notaDois = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "° aluno");
            nomes[i] = sc.nextLine();
            notaUm[i] = sc.nextDouble();
            notaDois[i] = sc.nextDouble();
            sc.nextLine();
        } 

        System.out.println();
        System.out.println("ALUNOS APROVADOS: ");
        for(int i = 0; i < n; i++){
            media = (notaUm [i] + notaDois[i]) / 2;
            if (media >= 6) {
                System.out.println("aluno(a) " + nomes[i] + " foi aprovado");  
            }
        }

        sc.close();
    }
}
