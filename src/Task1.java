

public class Task1 {
    public static void main (String[] args){
        Person person1 =new Person("Said",16,"Java dev",2500,500);
        Person person2 =new Person("enes",20,"Java dev",1500,200);
        Person person3 =new Person("Adilet",16,"JS dev",3500,550);
        Person person4 =new Person("Nursultan",17,"JS dev",5500,1500);
        Person person5 =new Person("Saida",26,"Java dev",5000,1000);

        Person [] persons={person1,person2,person3,person4,person5};
        Person.print(persons);
        System.out.println("\nPerson with lowest salary is: \n"+Person.getLowSalary(persons).name+"\n"+Person.getLowSalary(persons).salary);
        System.out.println("\nPerson with highest salary is: \n"+Person.getHighSalary(persons).name+"\n"+Person.getHighSalary(persons).salary);
        System.out.println("\nPerson with the most expensive phone is: \n"+Person.getPhonePrice(persons).name+"\n"+Person.getPhonePrice(persons).phonePrice);

    }

}
