package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class program {

    public static void main (String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ===");

        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("=== Test 3: seller findAll ===");
        List<Seller> result = sellerDao.findAll();
        for (Seller obj : result) {
            System.out.println(obj);
        }

        System.out.println("=== Test 4: seller insert ===");
        Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 1000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("inserted newSeller id: " + newSeller.getId());
    }
}
