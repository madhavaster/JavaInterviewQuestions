package recordclasses;

import java.math.BigDecimal;

public record Product(String name, BigDecimal price, String category) {
}
