package segitigaangka;
import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Persegi Angka");
        System.out.print("Masukkan sisi =");
        int sisi = s.nextInt();
        for (int i = 1; i <= sisi; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i+"");
            }
            System.out.println("");
            
            
        }
        
        
    }
}
