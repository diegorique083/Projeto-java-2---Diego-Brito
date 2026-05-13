import java.util.Locale;
import java.util.Scanner;

public class maiorQue{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        

        double [] vet = new double[n] ; 

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número real (ex: 8,0) ");
            vet[i] = sc.nextDouble();
            
        } 

        double maior = 0;
        double maiorValor = 0;

        for(int i = 0; i < n; i++){
            if (vet[i] > maior) {
                maior = vet[i];
                maiorValor = i+1;
                
            } 
        }
        
        System.out.printf("O maior valor é : %.2f " , maior);
        System.out.println();
        System.out.println("Na posição " + maiorValor); 

        sc.close();

    }

}