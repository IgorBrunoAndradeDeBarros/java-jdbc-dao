package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class program {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

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


        System.out.println("=== Test 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("verde");
        sellerDao.update(seller);
        System.out.println("updated seller id: " + seller.getId());

        System.out.println("=== Test 6: seller delete ===");
        System.out.println("Enter the id of the seller to delete: ");
        int id = scan.nextInt();
        sellerDao.deleteById(id);
        System.out.println("deleted seller id: " + id);


        System.out.println("=== Test 7: department findById ===");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("=== Test 8: department findAll ===");
        List<Department> departments = departmentDao.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }

        System.out.println("=== Test 9: department insert ===");
        Department newDepartment = new Department(null, "Sports");
        departmentDao.insert(newDepartment);
        System.out.println("inserted newDepartment id: " + newDepartment.getId());

        System.out.println("=== Test 10: department update ===");
        dep = departmentDao.findById(2);
        dep.setName("Marketing Verde");
        departmentDao.update(dep);
        System.out.println("updated department id: " + dep.getId());

        System.out.println("=== Test 11: department delete ===");
        System.out.println("Enter the id of the department to delete: ");
        int depId = scan.nextInt();
        departmentDao.deleteById(depId);
        System.out.println("deleted department id: " + depId);
    }
}
