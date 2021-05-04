package com.company;

import Restaurant.Menu;
import Restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem tacos = new MenuItem(5.95, "Tacos", "Main Course");
        Menu theBigList = new Menu();
        theBigList.addMenuItem(tacos);
        theBigList.listMenuItems();
        //comment
    }
}
