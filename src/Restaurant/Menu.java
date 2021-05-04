package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        int index = this.menuItems.indexOf(item);
        if(index < 0) {
            System.out.println("Menu item did not exist, nothing removed.");
        } else {
            this.menuItems.remove(index);
        }
    }

    public void listMenuItems() {
        for(MenuItem item : menuItems) {
            System.out.println("Description:  " + item.getDescription());
            System.out.println("Category:  " + item.getCategory());
            System.out.println("Price:  " + item.getPrice());
            System.out.println("Is New?  " + item.isNew());
        }
    }


}
