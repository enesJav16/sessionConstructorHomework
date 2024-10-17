import java.time.LocalDate;

public class Book {
    long id;
    String name;
    int price;
    String genre;
    LocalDate published;

    public Book(){}
    public Book(long id, String name, int price, String genre, LocalDate published){
        this.id=id;
        this.name=name;
        this.price=price;
        this.genre=genre;
        this.published=published;
    }

    public static void print (Book[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("ID          :"+a[i].id);
            System.out.println("Name        :"+a[i].name);
            System.out.println("Published   :"+a[i].published);
            System.out.println("Genre       :"+a[i].genre);
            System.out.println("Price       :"+a[i].price+"$");
            System.out.println("_________________________________");
        }
    }


}
