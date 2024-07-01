package Library;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String address; //collection location
    private String status;  //borrowing statues
    private int gty; //copies for sales
    private double price;


    private String brwCopies; //copies for borrowing
    // constructor

    public Book(String name, String author, String publisher, String address, String status, int gty, double price, String brwCopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.status = status;
        this.gty = gty;
        this.price = price;
        this.brwCopies = brwCopies;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGty() {
        return gty;
    }

    public void setGty(int gty) {
        this.gty = gty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrwCopies() {
        return brwCopies;
    }

    public void setBrwCopies(String brwCopies) {
        this.brwCopies = brwCopies;
    }
    //to string

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", gty=" + gty +
                ", price=" + price +
                ", brwCopies='" + brwCopies + '\'' +
                '}';
    }
}
