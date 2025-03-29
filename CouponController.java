import java.util.UUID;

public class CouponController {
    private CouponModel model;
    private CouponView view;

    public CouponController(CouponModel model, CouponView view) {
        this.model = model;
        this.view = view;
    }

    public void generateCoupon() {
        String userType = view.getUserType();
        int discount = model.getDiscount(userType);
        String couponCode = "COUPON-" + UUID.randomUUID().toString().substring(0, 8);

        view.displayCoupon(couponCode, discount);
}
}