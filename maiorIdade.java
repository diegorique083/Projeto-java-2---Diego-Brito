import java.util.Locale;
import java.util.Scanner;

public class maiorIdade {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

            System.out.println("Digite um número para rodar no programa: ");
            int n = sc.nextInt();
            sc.nextLine();

            String [] vet = new String[n];
            int [] vetor = new int[n]; 

            for(int i = 0; i < n; i++){
                System.out.println("Digite o " + (i+1) + "° nome: ");
                vet[i] = sc.nextLine();
                System.out.println("Digite a " + (i+1) + "° idade: ");
                vetor[i] = sc.nextInt();
                sc.nextLine();
                
            } 

            int maior = vetor[0];
            int posMaior = 0; 

            for(int i = 1; i < n; i ++){
                if (vetor[i] > maior) {
                    maior = vetor[i];
                    posMaior = i;
                }
            }

            System.out.print("A pessoa com a maior idade é : " +  vet[posMaior] + " com "  + maior + " anos");

            sc.close();
    }
}
