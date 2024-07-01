package Library;

public class BorrowBook implements IOOperation{
    @Override
    public void oper(DataBase dataBase , User user ) {
        System.out.println("Borrow Book");
    }
}
