class Book {
    String ISBN;
    String title;
    double price;


    Book(String ISBN, String title, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
    }

 
    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
   
        Book b1 = new Book("978-0135166307", "Java Programming", 550.0);

        
        b1.display();
    }
}