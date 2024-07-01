package Library;

import java.util.ArrayList;

public class DataBase {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<String> userNames = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<String> bookNames = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
        userNames.add(user.getName());
    }
    public int login(String phoneNumber , String email){
        int b = -1;
        for (User s : users){
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email) ){
                b = users.indexOf(s);
                break;
            }
        }
        return b;
    }
    public User getUser(int b){
        return users.get(b);
    }
    public void addBook(Book book){
        books.add(book);
        bookNames.add(book.getName());
    }
}
