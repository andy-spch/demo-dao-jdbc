package application;

import db.DbException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerdao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: SELLER findById ===");
        Seller seller = sellerdao.findById(3);


        System.out.println(seller);


        System.out.println("\n=== TEST 2: SELLER findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(department);
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: SELLER findAll ===");
        list = sellerdao.findALl();
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: SELLER insert ===");
        Seller seller2 = new Seller(null, "Joaquin", "joaquin@gmail.com", new Date(), 5000.0, department);
        sellerdao.insert(seller2);
        System.out.println("Usuário inserido com sucesso! Seu Id é " + seller2.getId());

        System.out.println("\n=== TEST 5: SELLER UPDATE ===");
        Seller seller3 = new Seller();
        seller3 = sellerdao.findById(1);
        seller3.setName("Martha Waine");
        seller3.setEmail("martha.waine@gmail.com");
        sellerdao.update(seller3);
        System.out.println("Update realizado com sucesso!");

        System.out.println("\n=== TEST 6: SELLER DELETE ===");
        int sellerToDelete = 21;
        try {
            System.out.println("Confirma a exclusão de " + sellerdao.findById(sellerToDelete).getName() + "? (S/N)");
        } catch (NullPointerException e){
            throw new DbException("No such id in database");
        }
        sellerdao.deleteById(sellerToDelete);
        System.out.println("Vendedor excluído com sucesso!");


    }

}
