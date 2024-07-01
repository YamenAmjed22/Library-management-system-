package Library;

public class ViewBook implements IOOperation {
    @Override
    public void oper(DataBase dataBase , User user ) {
        System.out.println("View book");
    }
}
