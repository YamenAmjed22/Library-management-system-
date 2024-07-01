package Library;

public class PlaceOrder implements IOOperation{
    @Override
    public void oper(DataBase dataBase , User user ) {
        System.out.println("Place Order");
    }
}
