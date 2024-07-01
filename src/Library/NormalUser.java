package Library;

import java.util.Scanner;

public class NormalUser extends User{
    @Override
    public void menu(DataBase dataBase , User user) {
        System.out.println("1.view books");
        System.out.println("2.search book");
        System.out.println("3.place order");
        System.out.println("4.borrow book");
        System.out.println("5.calculate fine");
        System.out.println("6.return book");
        System.out.println("7.exit");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        this.operation[userChoice-1].oper(dataBase, user);
        scanner.close();

    }

    public NormalUser(String name, String email, String phoneNumber) {

        super(name, email, phoneNumber);
        this.operation = new IOOperation[]{
                new ViewBook(),
                new SearchBook(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }
}
