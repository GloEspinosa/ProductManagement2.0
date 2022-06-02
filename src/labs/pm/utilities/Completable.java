package labs.pm.utilities;

@FunctionalInterface
public interface Completable<T> {
    
    public static final ProductStatus DEFAULT_STATUS = ProductStatus.NOT_STARTED;
    
    public abstract T applyProductStatus(ProductStatus productStatus);
    
    public default ProductStatus getProductStatus() {
        return DEFAULT_STATUS;
    }
    
    public static ProductStatus convert(int bar) {
        return (bar >= 0 && bar <= 5) ? ProductStatus.values()[bar] : DEFAULT_STATUS;
    }
    
    public default T applyProductStatus(int bar) {
        return applyProductStatus(convert(bar));
    }
}
