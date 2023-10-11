/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persegiangka;

/**
 *
 * @author Rizal
 */ import java.util.Scanner;
public class PersegiAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Persegi  Angka");
         System.out.print("Masukkan Sisi =");
         int sisi = s.nextInt();
         for (int i = 1; i <= sisi;i++){
             for (int j = 0; j < sisi; j++){
                 System.out.println(i+"");
                 
             }
             System.out.println("");
         }
    }
    
}
