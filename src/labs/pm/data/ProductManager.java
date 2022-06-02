package labs.pm.data;

import java.math.BigDecimal;
import labs.pm.utilities.ProductStatus;

public class ProductManager {
    
    public Product createProduct(int id, String name, String developerOrAuthor, BigDecimal price,
            ProductStatus productStatus) {
        return new Videogame(id, name, developerOrAuthor, price, productStatus);
    }
    
    public Product createProduct(int id, String name, String developerOrAuthor, BigDecimal price,
            ProductStatus productStatus, int stock) {
        return new Book(id, name, developerOrAuthor, price, productStatus, stock);
    }
    
}
