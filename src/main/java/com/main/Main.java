
package com.main;

import java.util.List;
import java.util.Scanner;

import com.controller.Controller;
import com.entity.User;
import com.exception.UserNotFoundException;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== USER MANAGEMENT SYSTEM =====");
            System.out.println("1. Save User");
            System.out.println("2. Get User By ID");
            System.out.println("3. Get All Users");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter User Name: ");
                    String name = sc.next();

                    User user = new User(id, name);

                    String msg = controller.saveUser(user);

                    System.out.println(msg);

                    break;


                case 2:

                    System.out.print("Enter User ID: ");
                    int searchId = sc.nextInt();

                    try {

                        User u = controller.getUser(searchId);

                        System.out.println(u);

                    } catch (UserNotFoundException e) {

                        System.out.println(e.getMessage());

                    }

                    break;


                case 3:

                    List<User> allUsers = controller.getAllUsers();

                    System.out.println(allUsers);

                    break;


                case 4:

                    System.out.print("Enter User ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Name: ");
                    String newName = sc.next();

                    User updateUser = new User(updateId, newName);

                    String updateMsg = controller.updateById(updateUser);

                    System.out.println(updateMsg);

                    break;


                case 5:

                    System.out.print("Enter User ID: ");
                    int deleteId = sc.nextInt();

                    String deleteMsg = controller.delete(deleteId);

                    System.out.println(deleteMsg);

                    break;


                case 6:

                    System.out.println("Thank You!");

                    break;


                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();

    }

}
