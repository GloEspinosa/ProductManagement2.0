package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import labs.pm.utilities.ProductStatus;

public final class Book extends Product {

    private int stock;
    /**
     * A variable that defines a
     * {@link java.time.LocalDate LocalDate} value of the date 
     * that will make the product not refundable
     */
    private LocalDate notRefundableAfter = LocalDate.now().plusDays(30);

    Book() {
        this(0, "no name", "not found", BigDecimal.ZERO, ProductStatus.NOT_STARTED, 0);
    }
    
    Book(int id, String name, String developerOrAuthor, BigDecimal price, 
            ProductStatus productStatus, int stock) {
        super(id, name, developerOrAuthor, price, productStatus);
        this.notRefundableAfter = notRefundableAfter;
        this.stock = stock;
    }
    
    /**
     * Get the value of notRefundableAfter
     * @return the value of notRefundableAfter
     */
    public LocalDate getNotRefundableAfter() {
        return notRefundableAfter;
    }
    public int getStock() {
        return stock;
    }
    

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        LocalTime salesStart = LocalTime.of(15, 30);
        LocalTime salesEnd = LocalTime.of(16,00);
        
        return (now.isAfter(salesStart) && now.isBefore(salesEnd)) ?
                super.getDiscount() : BigDecimal.ZERO;
        
        
    }
    
    public String isAvailable() {
        return (getStock() > 0) ? "" : " Not available";
    }
    
    @Override
    public String toString() {
        return super.toString() + isAvailable(); 
    }

    @Override
    public Product applyProductStatus(ProductStatus newProductStatus) {
        return new Book(getId(), getName(), getDeveloperOrAuthor(), getPrice(), 
        newProductStatus, getStock());
    }
    
    
    
    
}
