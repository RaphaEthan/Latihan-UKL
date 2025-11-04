import java.util.Scanner;

public class Soalsedang2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        System.out.println("Volume tabung = " +(3.14*r*t));

}
}