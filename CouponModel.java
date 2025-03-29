import java.util.HashMap;
import java.util.Map;

public class CouponModel {
    private Map<String, Integer> discountMap;

    public CouponModel() {
        discountMap = new HashMap<>();
        discountMap.put("Daily Customer", 10);
        discountMap.put("New User", 20);
        discountMap.put("Special User", 30);
    }

    public int getDiscount(String userType) {
        return discountMap.getOrDefault(userType, 0);
    }
}