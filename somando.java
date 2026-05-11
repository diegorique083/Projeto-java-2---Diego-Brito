import java.util.Locale;
import java.util.Scanner;

public class somando {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double soma = 0;
        double media = 0; 

        System.out.println("Digite quantos números você quer no array: ");
        int n = sc.nextInt();
        sc.nextLine(); // BUFFER 
        
        double [] vet = new double[n]; // abrindo array 

        // abrindo o primeiro for: 
        for(int i = 0; i < n; i++){
            System.out.println("Digite algum número real (ex: 10,8) - ");
            vet[i] = sc.nextDouble(); 
        
        // Abrindo o segundo for    
        }
        for(int i = 0; i < n; i++){
            soma = soma + vet[i];
            
        } 
        
        //Final do código
        media = soma /  n;
        System.out.println("A soma dos números é " + soma );
        System.out.println("A média da soma dos números é  " + media); 

        sc.close();                                        

    }
}