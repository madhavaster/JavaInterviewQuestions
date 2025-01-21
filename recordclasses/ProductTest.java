package recordclasses;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void createProduct() {
        var product = new Product("IPhone", BigDecimal.valueOf(50000), "Mobiles");
        assertEquals("IPhone", product.name());
    }
}