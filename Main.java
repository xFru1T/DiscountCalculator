// 1. Методы: параметры, return
// Написать метод calculateDiscount, который принимает сумму покупки и процент скидки,
// а затем возвращает сумму с учетом скидки.
import java.util.*;
class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print purchase amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Print discount percentage: ");
        double discountPercentage = scanner.nextDouble();
        System.out.println("Total amount: " + calculateDiscount(amount, discountPercentage));
        }
    public static double calculateDiscount(double amount, double discountPercentage) {
        return amount - (amount * discountPercentage / 100);
        }
    }

