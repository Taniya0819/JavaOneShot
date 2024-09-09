package ST1;

import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title1 = sc.nextLine();
        String author1 = sc.nextLine();
        double price1 = sc.nextDouble();
        Books b2 = new Books(title1, author1, price1);
        b2.displayBooks();
        Books b1 = new Books("3 idiots","Chetan Bhagat",400);
        b1.displayBooks();
    }
}
// class
class Books{
    private String title;
    private String author;
    private double price;

// constructor
public Books(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
}
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author=author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public void displayBooks(){
        System.out.println("Title "+ title);
        System.out.println("Author "+ author);
        System.out.println("Price "+ price);
    }

}

