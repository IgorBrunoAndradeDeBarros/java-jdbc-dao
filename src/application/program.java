package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class program {

    public static void main (String[] args) {

        Department department = new Department(1,"books");
        Seller seller = new Seller(21,"bob", "bob@gmail.com", new Date(), 1000.0, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(department);
        System.out.println(seller);
    }
}
