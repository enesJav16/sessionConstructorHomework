public class Library {
    long id;
    String name;
    String address;
    Book [] books;

    public Library(){}
    public Library(long id,String name,String address,Book [] books){
        this.id=id;
        this.name=name;
        this.address=address;
        this.books=books;
    }

    public static Library content (Library[]a, int b){
        int counter=0;
        for (int i = 0; i <a.length ; i++) {
            if(b==a[i].id){
                counter=i;
            }
        }
        return a[counter];
    }
    public static void printContent (Library a){
        int j=1;
        for (int i = 0; i < a.books.length; i++) {
            System.out.println(j+": "+a .books [i].name);
            System.out.println("...................");
            j++;
        }
    }

}
