package teoria.metodosObject;

public class MainPerson
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(1, "juan");
        Person p2 = (Person) p1.clone();
        p2.setName("luis");
        System.out.println(p1);
        System.out.println(p2);
    }
}
