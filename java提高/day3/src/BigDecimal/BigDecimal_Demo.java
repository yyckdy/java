package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Demo {
    public static void main(String[] args) {
        BigDecimal a1 = BigDecimal.valueOf(3.0);
        BigDecimal a2 = BigDecimal.valueOf(10.0);
        BigDecimal a3 = a1.divide(a2,1, RoundingMode.HALF_UP);
        double rs=a3.doubleValue();
        System.out.println(rs);


    }
}
