import java.util.Locale;
import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite quantos números deseja rodar no programa: ");
        int n = sc.nextInt();
        sc.nextLine();

        int [] vet = new int[n]; 

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        int quantPar = 0;

        for(int i = 0; i < n; i++){
            if (vet[i] % 2 == 0)  {
                System.out.println("Número par encontrado:  " + vet[i]); 
                quantPar ++;     
            }
        } 
        

        if (quantPar == 0) {
            System.out.println("Não há números pares no vetor");
            
        } 

        System.out.println();

        System.out.print(" A qantidade de números pares é: " + quantPar); 

        sc.close();
    }
}
