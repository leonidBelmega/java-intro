package lesson02;

public class Person {

String firstName;
String secondname;
int age;
private static int count = 0;

        Person(String firstName,String secondname, int age) {
            this.firstName= firstName;
            this.secondname = secondname;
            this.age = age;
            count++;
            System.out.println("Person" +" " + firstName + " " + secondname + " " + age);

        }
 void  DoSomething(){
            String end = "is doing bla bla bla";
     System.out.println(firstName + " " + secondname + " " + " " + age + end);
     }

static {
    System.out.println("First person loading");
}
    {
        if(count==0){
        }
        else{System.out.println(count + "class loading");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!firstName.equals(person.firstName)) return false;
        return secondname != null ? secondname.equals(person.secondname) : person.secondname == null;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + (secondname != null ? secondname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Lille","Addams", 42);
        Person person2 = new Person("Lille","Addams", 42);
        Person person3 = new Person("Lillo","Addams", 32);
        Person person4 = new Person("Lillu","Addams", 42);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

    }
}
