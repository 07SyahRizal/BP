package bilanganganjilwhile;
import java.util.Scanner;
public class bilanganganjilwhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bilangan, counter;
        System.out.println("deretan bilangan ganjil");
        System.out.print("masukkan angka = ");
        bilangan = s.nextInt();
        counter = 1;
        while(counter <= bilangan){
            System.out.println(counter+"");
            counter+= 2;
        }
        System.out.println("");
        
    }
    
}
