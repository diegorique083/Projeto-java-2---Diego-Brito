import java.util.Locale;
import java.util.Scanner;

public class mediaPares {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número para rodar o programa: ");
        int n = sc.nextInt();

        int [] vet = new int[n]; 

        for(int i = 0 ; i < n; i++){
            System.out.println("Digite o " + (i+1) + "º número" );
            vet[i] = sc.nextInt();


        }

        int soma = 0;
        double media = 0;
        int contPar = 0;

        System.out.println("EXIBIÇÃO DOS PARES: ");
        for(int i = 0; i < n; i++){
            if (vet[i] % 2 ==0) {
                soma = soma + vet[i]; // armazena os pares 
                contPar++; // conta os pares 
                System.out.println(vet[i]);
                
            }
        } 

        System.out.println();
        if (contPar == 0) {
            System.out.println("NENHUM NÚMERO PAR ENCONTRADO");
          
        } else {
            media = soma / contPar;
            System.out.println("MEDIA DOS PARES: " + media);
        }

        sc.close();
    }
}