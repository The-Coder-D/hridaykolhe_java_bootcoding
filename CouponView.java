import java.util.Scanner;

public class CouponView {
    private Scanner scanner;

    public CouponView() {
        scanner = new Scanner(System.in);
    }

    public String getUserType() {
        System.out.println("Enter user type (Daily Customer, New User, Special User): ");
        return scanner.nextLine();
    }

    public void displayCoupon(String couponCode, int discount) {
        System.out.println("Generated Coupon Code: " + couponCode);
        System.out.println("Discount Applied: " + discount + "%");
    }
}