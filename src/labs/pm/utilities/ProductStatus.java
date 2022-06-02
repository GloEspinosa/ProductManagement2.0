package labs.pm.utilities;

public enum ProductStatus {
    
    NOT_STARTED("\u2591\u2591\u2591\u2591"), 
    JUST_STARTED("\u2588\u2591\u2591\u2591"),
    IN_PROGRESS("\u2588\u2588\u2591\u2591"),
    MAIN_STORY("\u2588\u2588\u2588\u2591"),
    COMPLETED("\u2588\u2588\u2588\u2588");
    
    private String bar;

    private ProductStatus(String bar) {
        this.bar = bar;
    }
    public String getBar() {
        return bar;
    }
    
}
