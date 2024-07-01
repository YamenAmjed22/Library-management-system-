package Library;

import java.util.Scanner;

public class Main {
    static Scanner s;
    static DataBase dataBase;
    public static void main(String[] args) {

            dataBase = new DataBase();
            System.out.println("Welcome to Library Management system!\n");
            int theUserChoice;
            do{
                System.out.println("0.Exit\n1.login\n2.New User");
                s = new Scanner(System.in);
                theUserChoice = s.nextInt();
                switch (theUserChoice){
                    case 1 :
                        login();
                        break;
                    case 2:
                        newUser();
                        break;
                    default:
                        System.out.println("Error , chick your choice plz !! ");
                }

            }while (theUserChoice!=0);
    }
    private static void login(){
        System.out.println("Enter phone number:");
        String phoneNumber = s.next();
        System.out.println("Enter Email:");
        String email = s.next();
        int n = dataBase.login(phoneNumber,email);
        if (n != -1){
            User user = dataBase.getUser(n);
            user.menu(dataBase,user);
            System.out.println("welcome in the library "+user.getName());
        }else {
            System.out.println("the user not exist");;
        }
    }
    private static void newUser(){
        System.out.println("Enter your name:");
        String name = s.next();
        System.out.println("Enter phone number:");
        String phoneNumber = s.next();
        System.out.println("Enter Email:");
        String email = s.next();
        System.out.println("1.Admin\n2.Normal user");
        User user;
        int userChoice = s.nextInt();
        if (userChoice==1){
                 user = new Admin(name,email,phoneNumber);
        }else{
                user = new NormalUser(name,email,phoneNumber);
        }
        dataBase.addUser(user);
        user.menu(dataBase,user);

    }
}
