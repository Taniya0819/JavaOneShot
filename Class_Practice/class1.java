//package Class_Practice;
//
//public class class1 {
//    public class Book {
//        // Properties
//        private String title;
//        private String author;
//        private double price;
//
//        // Constructor to initialize all properties
//        public Book(String title, String author, double price) {
//            this.title = title;
//            this.author = author;
//            this.price = price;
//        }
//
//        // Getter and Setter methods for title
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        // Getter and Setter methods for author
//        public String getAuthor() {
//            return author;
//        }
//
//        public void setAuthor(String author) {
//            this.author = author;
//        }
//
//        // Getter and Setter methods for price
//        public double getPrice() {
//            return price;
//        }
//
//        public void setPrice(double price) {
//            this.price = price;
//        }
//
//        // Method to display the details of the book
//        public void displayDetails() {
//            System.out.println("Book Details:");
//            System.out.println("Title: " + title);
//            System.out.println("Author: " + author);
//            System.out.println("Price: $" + price);
//        }
//
//        // Main method to create an instance of the Book class, set its properties, and display its details
//        public static void main(String[] args) {
//            // Creating an instance of the Book class
//            Book book = new Book("1984", "George Orwell", 9.99);
//
//            // Displaying the details of the book
//            book.displayDetails();
//
//            // Modifying the properties of the book
//            book.setTitle("Animal Farm");
//            book.setAuthor("George Orwell");
//            book.setPrice(7.99);
//
//            // Displaying the updated details of the book
//            book.displayDetails();
//        }
//    }
//
//}
