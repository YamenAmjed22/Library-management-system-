package Library;

import java.util.Scanner;

public class Admin extends  User{

    @Override
    public void menu(DataBase dataBase , User user) {
        System.out.println("1.View books");
        System.out.println("2.Add books");
        System.out.println("3.Delete books");
        System.out.println("4.Search books");
        System.out.println("5.Delete all data");
        System.out.println("6.View orders");
        System.out.println("7.Exit");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        this.operation[userChoice-1].oper(dataBase, user);



    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operation = new IOOperation[]{
                new ViewBook(),
                new AddBook(),
                new DeleteBook(),
                new SearchBook(),
                new DeleteAllData(),
                new ViewOrder(),
                new Exit()



        };
    }
}
