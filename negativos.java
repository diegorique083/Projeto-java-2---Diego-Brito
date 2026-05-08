import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        System.out.println("Quantos números você deseja: ");
        int n = sc.nextInt();
        sc.nextLine(); // BUFFER 

        float [] vet = new float[n]; // ABRINDO ARRAY

        for(int i = 0; i < n; i++){
            System.out.println("Digite os números que desejar: ");
            vet[i] = sc.nextFloat();
            sc.nextLine(); // BUFFER 
         }
         System.out.println("números negativos : ");

         boolean temNegativo = false;
         for(int i = 0; i < n; i++){
            if (vet[i] < 0) {
                System.out.print(vet[i] + " " ) ;
                temNegativo = true;
            }
            
         } 
         if (!temNegativo) {
            System.out.println("Nenhum número negativo foi digitado!");
            
         }

         sc.close();
    }
}
