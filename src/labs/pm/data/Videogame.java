package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import labs.pm.utilities.ProductStatus;

public final class Videogame extends Product {

    public Videogame() {
        this(0, "no name", "not found", BigDecimal.ZERO, ProductStatus.NOT_STARTED);
    }
    
    Videogame(int id, String name, String developerOrAuthor, BigDecimal price, ProductStatus productStatus) {
        super(id, name, developerOrAuthor, price, productStatus);
    }
    
    Videogame(int id, String name, String developerOrAuthor, BigDecimal price) {
        super(id, name, developerOrAuthor, price, ProductStatus.NOT_STARTED);
    }
    
    @Override
    public BigDecimal getDiscount() {
        LocalDate today = LocalDate.now();
        LocalDate salesStart = LocalDate.of(2022, Month.NOVEMBER, 01);
        LocalDate salesEnd = LocalDate.of(2022, Month.DECEMBER, 01);
        
        return (today.isAfter(salesStart) && today.isBefore(salesEnd)) ?
                super.getDiscount() : BigDecimal.ZERO;    
    }

    @Override
    public Product applyProductStatus(ProductStatus newProductStatus) {
        return new Videogame(getId(), getName(), getDeveloperOrAuthor(), 
                getPrice(), newProductStatus);
    }
    
}
