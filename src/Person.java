public class Person {
    String name;
    int age;
    String work;
    int salary;
    int phonePrice;

    public Person(){}
    public Person (String name, int age, String work, int salary,int phonePrice){
        this.name=name;
        this.age=age;
        this.work=work;
        this.salary=salary;
        this.phonePrice=phonePrice;
    }

    public static void print(Person[]persons){
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Name       : "+persons[i].name);
            System.out.println("Age        : "+persons[i].age);
            System.out.println("Speciality : "+persons[i].work);
            System.out.println("Salary     : "+persons[i].salary);
            System.out.println("Phone price: "+persons[i].phonePrice);
            System.out.println("_________________");
        }
    }

    public static Person getLowSalary(Person[]a){
        int low=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].salary<a[low].salary){
                low=i;
            }
        }
        return a[low];
    }
    public static Person getHighSalary(Person[]a){
        int high=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].salary>a[high].salary){
                high=i;
            }
        }
        return a[high];
    }

    public static Person getPhonePrice(Person[]a){
        int high=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].phonePrice>a[high].phonePrice){
                high=i;
            }
        }
        return a[high];
    }

}
