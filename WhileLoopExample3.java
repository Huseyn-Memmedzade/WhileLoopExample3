package yenipabka;

import java.util.Scanner;

public class WhileLoopExample3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin (50-dən kiçik və ya bərabər): ");
        int eded = sc.nextInt();

        // Döngənin başlanğıcını yoxlamaq üçün əlavə məntiq
        if (eded > 50) {
            System.out.println("Daxil etdiyiniz ədəd 50-dən böyükdür. Döngə icra olunmayacaq.");
        } else {
            System.out.println("Daxil etdiyiniz ədəddən 50-yə qədər ədədlər:");
            while (eded <= 50) {
                System.out.println(eded);
                eded++;
            }
        }

        sc.close(); // Resursları sərbəst buraxmaq



    }
}