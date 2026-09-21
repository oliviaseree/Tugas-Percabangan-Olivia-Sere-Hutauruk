import java.util.Scanner;

public class TugasPercabanganSkenario1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int nilai;
        System.out.print("Masukkan nilai (0-100): ");
        nilai = sc.nextInt();
        if (nilai >= 85) {
            System.out.println("A");}
            else if (nilai >= 70) {
            System.out.println("B");}
            else if (nilai >= 55) {
            System.out.println("C");}
            else if (nilai >= 40) {
            System.out.println("D");}
            else { System.out.println("E");}
    }
}
