/**
 * {@code Product} class represents properties and behaviours of
 * product objects in the Product Management System.
 * <br>
 * Each product has an id, name, developer, and price
 * <br>
 * Each product can have a discount, calculated based on a 
 * {@link DISCOUNT_RATE discount rate}
 * @version 2.0
 * @author gEpi
 */
package labs.pm.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;
import java.time.LocalDate;
import labs.pm.utilities.Completable;
import labs.pm.utilities.ProductStatus;

public abstract class Product implements Completable<Product>{
    
    private int id;
    private String name;
    private String developerOrAuthor;
    private BigDecimal price;
    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal} value of the discount rate
     * <br>
     * Discount rate is 20%
     */
    private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.2);
    private ProductStatus productStatus;
    
//    public Product() {
//        this(0, "no name", "not found", BigDecimal.ZERO, 0);
//    }

    Product(int id, String name, String developerOrAuthor, BigDecimal price, ProductStatus productStatus) {
        this.id = id;
        this.name = name;
        this.developerOrAuthor = developerOrAuthor;
        this.price = price;
        this.productStatus = productStatus; 
    }
    
//    public Product(int id, String name, BigDecimal price) {
//        this(id, name, price, ProductStatus.NOT_STARTED);
//    }
    
    public int getId() {
        return id;
    }
//    public void setId(final int id) {
//        this.id = id;
//    }
    public String getName() {
        return name;
    }
//    public void setName(final String name) {
//        this.name = name;
//    }
    public String getDeveloperOrAuthor() {
        return developerOrAuthor;
    }
    public BigDecimal getPrice() {
        return price;
    }
//    public void setPrice(final BigDecimal price) {
//        this.price = price;
//    }
    
//    public String isAvailable() {
//        return (stock > 0) ? "" : "Not available";
//    }
    /**
     * Calculates discount based on a product price and
     * {@link DISCOUNT_RATE discount rate}
     * @return a {@link java.math.BigDecimal BigDecimal}
     * value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }
    
    @Override
    public ProductStatus getProductStatus() {
        return productStatus;
    }
    public abstract Product applyProductStatus(ProductStatus newProductStatus);    
    // Product attributes cannot be changed.
    // A new Product object can be created, which
    // is a replica of the existing Product with 
    // any required attribute adjustments.

    /**
     * The product will not be refundable as of today
     * @return current day 
     */
    public LocalDate getNotRefundableAfter() {
        return LocalDate.now();
    }
    
    @Override
    public String toString() {
        return id + ", " + name + ", " + developerOrAuthor + ", " + price + ", " + getDiscount() 
                + " " + productStatus.getBar() + " " + getNotRefundableAfter();
    }
    
}
