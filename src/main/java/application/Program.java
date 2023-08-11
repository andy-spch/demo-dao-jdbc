package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerdao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: SELLER findById ===");
        Seller seller = sellerdao.findById(3);


        System.out.println(seller);


        System.out.println("\n== TEST 2: SELLER findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(department);
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("\n== TEST 3: SELLER findAll ===");
        list = sellerdao.findALl();
        for(Seller obj: list){
            System.out.println(obj);
        }

    }
}
