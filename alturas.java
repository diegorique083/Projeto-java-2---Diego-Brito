import java.util.Scanner;
import java.util.Locale;
public class alturas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US); 

        System.out.println("Digite o número de pessoas para cadastro: ");
        int n = sc.nextInt(); 
        sc.nextLine();

        String [] vet = new String[n];
        int [] vetor = new int[n];
        double [] vetinho = new double[n];


        System.out.println("Digite o nome , idade e altura (ex: 1,65) seguindo a ordem:   ");

        for(int i = 0; i < n; i++){
            vet[i] = sc.nextLine();
            vetor[i] = sc.nextInt();
            sc.nextLine();
            vetinho[i] = sc.nextDouble();
            sc.nextLine();         
        } 

        for(int i = 0; i < n; i++){
            System.out.println("pessoa " + (i+1) + " - " + vet[i] + " Tem " + vetor[i] + " anos " + " de idade " + " e " +  
            vetinho[i] + " de altura . ");
 
        }
        
        System.out.println();

        double soma = 0;
        double media = 0;
        double cont = 0;
        double porcent = 0;

        for(int i = 0; i < n; i++ ){
            soma = soma + vetinho[i];
        } 

        media = soma / n; 

        System.out.printf("A média da altura dos usuarios e: %.2f", media);
        System.out.println();


        for(int i = 0; i < n; i++){
            if (vetor[i] < 16) {
                cont++;
                
            
            }
        }

        if (cont == 0) {
            System.out.println("Não há usuário menor de idade.");
            
        }

        porcent = cont * 100 / n;
        System.out.printf("A porcentagem de menores de idade é de %.2f : ", porcent);
        System.out.println();

        System.out.println();

        System.out.println("Esses usuários são menores de idade: ");
        for(int i = 0; i < n; i++){
            if (vetor[i] < 16) {
                System.out.println(vet[i]);
                
            }

        }







        
        

    } 

 }

