package OOPS;

public class A163 {
    public static void main(String args[]){
        System.out.print(Book.count+" ");
        Book b1 = new Book(150);
        Book b2 = new Book(200);
        System.out.println(Book.count);

    }
    
}
class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}