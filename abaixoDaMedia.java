import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        System.out.println("Digite um número: "); 
        int n = sc.nextInt();
        

        double [] vet = new double[n];
        for(int i = 0; i < n; i++){
            System.out.println("Digite o " + (i+1) + "º " + "número");
            vet[i] = sc.nextDouble();
        } 

        double soma = 0;
        double media = 0;


        System.out.println("NÚMEROS SELECIONADOS: ");
        for(int i = 0; i < n; i++){ 
            System.out.println(" -> " + vet[i] ); 
            soma = soma + vet[i];

        } 

        System.out.println();

        media = soma / n ; 
        System.out.println("A média dos números é:  " + media);

        System.out.println();


        System.out.println("NÚMEROS ABAIXO DA MÉDIA: ");
        for(int i = 0; i < n ; i++ ){
            if (vet[i] < media) { 
                System.out.println( " -> " + vet[i]);
                
            }
        } 

        sc.close();
        
    }
}