import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        System.out.println("Digite um número para rodar no loop: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int [n];

        for(int i = 0; i < n ; i++){
            System.out.println("Digite os números do vetor A: ");
            a[i] = sc.nextInt();

        } 
        
        System.out.println();

        for(int i = 0; i < n ; i++){
            System.out.println("Digite os números do vetor B: ");
            b[i] = sc.nextInt();

        } 

        for(int i = 0; i < n ; i++){
            c[i] = a[i] + b[i];

        } 

        for(int i = 0; i < n ; i++){
            System.out.println("Os valores da soma dos vetores (A + B) é "  + c[i]);

        } 

        

        sc.close();


    }
}
