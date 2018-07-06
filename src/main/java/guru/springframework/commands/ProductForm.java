package guru.springframework.commands;


import ch.qos.logback.core.net.SyslogOutputStream;

import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
public class ProductForm {
    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrices(BigDecimal price) {
        this.price = price;
    }

    public String getImUrl() {
        return imageUrl;
    }

    public void setImageUrlm(String imageUrl) {
        this.imageUrl = imageUrl;
        System.out.print("This is a test");
        System.out.println("this is test 4");
        System.out.println("whats up");
        System.out.println("hghghg");

    }
}
