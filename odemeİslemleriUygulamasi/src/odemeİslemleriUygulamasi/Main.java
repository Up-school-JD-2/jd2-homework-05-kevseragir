
package odemeİslemleriUygulamasi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
    	 Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Kart no: ");
            String cartNumber = scanner.nextLine();
            if (!isValidCartNumber(cartNumber)) {
                throw new Exception("16 karakter olmalı ve harf içeremez.");
            }

            System.out.print("Guvenlik kodu: ");
            String password = scanner.nextLine();
            if (!isValidPassword(password)) {
                throw new Exception("3 karakter olmalı ve harf içeremez.");
            }

            System.out.print("Yil: ");
            String year = scanner.nextLine();
            if (!isValidYear(year)) {
                throw new Exception("2023 den buyuk olamaz");
            }

            System.out.print("Tutar: ");
            String cost = scanner.nextLine();
            if (!isValidCost(cost)) {
                throw new Exception("Negatif ve virgul olmaz");
            }

            System.out.println("Girilen bilgiler doğru.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidCost(String cost) {
        try {
            int _cost = Integer.parseInt(cost);
            return _cost >= 0 && !cost.contains(",");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidYear(String year) {
        try {
            int _year = Integer.parseInt(year);
            return _year <= 2023;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidCartNumber(String cartNumber) {
        return cartNumber.length() == 16 && cartNumber.matches("\\d+");
    }

    private static boolean isValidPassword(String password) {
        return password.length() == 3 && password.matches("\\d+");
    }
}