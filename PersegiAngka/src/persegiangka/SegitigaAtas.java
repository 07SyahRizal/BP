/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persegiangka;

/**
 *
 * @author Rizal
 */ import java.util.Scanner;
public class SegitigaAtas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Segitiga Atas");
        System.out.println("Masukkan N =");
        int j, N= s.nextInt();
        while(N>0){
            j=1;
            do{
                System.out.print(j+"");
                j++;
            }while(j<=N);
            N--;
            System.out.println("");
        }
    }
}
