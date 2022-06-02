/*
 * Copyright (C) 2022 gEpi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * {@code Shop] class represents an application that manages Products
 * @version 2.0
 * @author gEpi
 */
package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.utilities.ProductStatus;

/**
 *
 * @author gEpi
 */
public class Shop {

    public static void main(String[] args) {
        
//        Product p1 = new Product();
//        p1.setId(1);
//        p1.setName("Baba is You");
//        p1.setDeveloper("Hempuli");
//        p1.setPrice(BigDecimal.valueOf(9.99));

        ProductManager pm = new ProductManager();
        Product p1 = pm.createProduct(101, "Baba is You", "Hempuli", BigDecimal.valueOf(9.99), ProductStatus.IN_PROGRESS);
        Product p2 = pm.createProduct(102, "Dark Souls", "FromSoftware", BigDecimal.valueOf(29.99), ProductStatus.MAIN_STORY);
        Product p3 = pm.createProduct(103, "The Last Wish", "Andrzej Sapkowski", BigDecimal.valueOf(11.99), ProductStatus.COMPLETED);
        Product p4 = pm.createProduct(104, "Fire Emblem", "Intelligent Systems", BigDecimal.valueOf(49.95), ProductStatus.JUST_STARTED);
        Product p5 = p3.applyProductStatus(ProductStatus.IN_PROGRESS);
        Product p8 = p4.applyProductStatus(ProductStatus.COMPLETED);
        Product p9 = p1.applyProductStatus(ProductStatus.JUST_STARTED);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p8);
        System.out.println(p9);
        
        Product p6 = pm.createProduct(106, "The Lord of the Rings: the Two Towers", "J.R.R Tolkien", BigDecimal.valueOf(17.99), ProductStatus.COMPLETED, 3);
        Product p7 = pm.createProduct(106, "The Lord of the Rings: the Two Towers", "Electronic Arts", BigDecimal.valueOf(5.25), ProductStatus.COMPLETED);
        
//        Product p1 = new Videogame(101, "Baba is You", "Hempuli", BigDecimal.valueOf(9.99));
//        Product p2 = new Videogame(102, "Dark Souls", "FromSoftware", BigDecimal.valueOf(30.0), ProductStatus.MAIN_STORY);
//        Product p3 = new Book(103, "The Last Wish", "Andrzej Sapkowski", BigDecimal.valueOf(11.99), ProductStatus.COMPLETED, 0);
//        //Product p4 = new Product();
//        Product p4 = new Videogame(104, "Fire Emblem: Three Houses", "Intelligent Systems", BigDecimal.valueOf(59.95), ProductStatus.MAIN_STORY);
//        Product p5 = p3.applyProductStatus(ProductStatus.NOT_STARTED);
//        Product p8 = p4.applyProductStatus(ProductStatus.COMPLETED);
//        Product p9 = p1.applyProductStatus(ProductStatus.JUST_STARTED);
        
//        System.out.println(p1.getId() + ", " + p1.getName() + ", " + p1.getPrice() + ", " + p1.getDiscount() +
//                " " + p1.getProductStatus().getBar() + " " + p1.isAvailable());
        
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p5);
//        System.out.println(p8);
//        System.out.println(p9);
//
//        Product p6 = new Book(106, "The Lord of the Rings: the Two Towers", "J.R.R Tolkien", BigDecimal.valueOf(17.99), ProductStatus.COMPLETED, 3);
//        Product p7 = new Videogame(106, "The Lord of the Rings: the Two Towers", "Electronic Arts", BigDecimal.valueOf(5.25), ProductStatus.COMPLETED);
//        
//        System.out.println(p6);
//        System.out.println(p7);
//        
////        if (p3 instanceof Book) {
////            System.out.println(((Book)p3).getNotRefundableAfter());
////        }
//
//        System.out.println(p3.getNotRefundableAfter());
//        System.out.println(p1.getNotRefundableAfter());
    }
    
}
