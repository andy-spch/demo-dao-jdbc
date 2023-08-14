package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {
    public static void main(String[] args) {


        DepartmentDao sellerdao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: DEPARTMENT findById ===");


        System.out.println("\n=== TEST 2: DEPARTMENT findByDepartment ===");


        System.out.println("\n=== TEST 3: DEPARTMENT findAll ===");


        System.out.println("\n=== TEST 4: DEPARTMENT insert ===");


        System.out.println("\n=== TEST 5: DEPARTMENT UPDATE ===");


        System.out.println("\n=== TEST 6: DEPARTMENT DELETE ===");





    }
}
