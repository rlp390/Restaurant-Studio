package Restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {
    private Double price;
    private String description;
    private String category;

    public MenuItem(Double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public void setPrice(Double newPrice) {
        this.price = newPrice;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public Boolean isNew() {
        return true;
    }
}
