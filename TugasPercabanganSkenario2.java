import java.util.Scanner;

public class TugasPercabanganSkenario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Status Member (GOLD/SILVER/BRONZE/ (REGULER/Lainnya) ) : ");
        String status = sc.nextLine();

        int diskon;

        if (status.equals("GOLD")) {
            diskon = 20; }
        else if (status.equals("SILVER")) {
            diskon = 15; }
        else if (status.equals("BRONZE")) {
            diskon = 10; }
        else {
            status = "REGULER/Lainnya";
            diskon = 0; }
        System.out.println("Status Member : " + status);
        System.out.println("Diskon: " + diskon + "%");

    }
}