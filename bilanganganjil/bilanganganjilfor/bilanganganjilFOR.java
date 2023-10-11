/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilanganganjilfor;

/**
 *
 * @author Rizal
 */ import java.util.Scanner;
public class bilanganganjilFOR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("deret bilangan ganjil");
        System.out.print("masukkan angka = ");
        int bilangan = s.nextInt();
        for(int i = 1; i <= bilangan; i+=2) {
            System.out.println(""+i);
        }
    }
}
