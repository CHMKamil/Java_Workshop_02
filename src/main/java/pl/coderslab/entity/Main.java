package pl.coderslab.entity;

import org.mindrot.jbcrypt.BCrypt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ----------------------> Test: creating a user <--------------------------
//        UserDAO userDAO = new UserDAO();
//        User user = new User();

//        user.setUserName("Spec");
//        user.setEmail("kamil@gmail.com");
//        user.setPassword("coderslab");
//
//        userDAO.create(user);

//        ---------------------> Test: read a user from db <--------------------------
//        UserDAO userDAO = new UserDAO();
//        System.out.println(userDAO.read(1).getId());
//        System.out.println(userDAO.read(1).getUserName());
//        System.out.println(userDAO.read(1).getEmail());
//        System.out.println(userDAO.read(1).getPassword());
//        System.out.println(userDAO.read(2).getPassword());

//        ---------------------> Test: update a user <-----------------------------
//        UserDAO userDAO = new UserDAO();
//        for (int i = 1; i <= 353; i++){
//            User u1 = userDAO.read(i);
//            u1.setPassword(u1.getPassword());
//            userDAO.update(u1);
//        }

//        u1.setUserName("Tony Montana");
//        u1.setEmail("tm99@gmail.com");

//        userDAO.update(u1);
//        System.out.println(u1.getId());

//        ---------------------> Test: delete a user <-----------------------------
//        UserDAO userDAO = new UserDAO();
//        userDAO.delete(2);
//        User user = new User();
//        user.setEmail("filip@gmail.com");
//        user.setUserName("Filip");
//        user.setPassword("Filip123");
//        userDAO.create(user);
//        userDAO.delete(2);

//        ----------------------> Test: finding all users <-------------------------
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.findAll().length);
        System.out.println(Arrays.toString(userDAO.findAll()));
//        System.out.println(userDAO.findAll()[0].getEmail());
//        System.out.println(userDAO.findAll()[1].getEmail());



    }
}
