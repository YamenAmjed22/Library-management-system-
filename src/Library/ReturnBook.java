package Library;

public class ReturnBook implements IOOperation {
    @Override
    public void oper(DataBase dataBase , User user ) {
        System.out.println("Return Book");
    }
}
