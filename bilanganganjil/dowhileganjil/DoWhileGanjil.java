package dowhileganjil;
import java.util.Scanner;
public class DoWhileGanjil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int bilangan = s.nextInt();
        System.out.println("deretan bilangan ganjil : ");
        int counter = 1;
        do{
            System.out.println(counter+"");
            counter+= 2;
        }while(bilangan >= counter);
                
    }
    
}
