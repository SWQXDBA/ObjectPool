import java.util.Scanner;

public class t {
    public static void main(String[] args) {


        System.out.println("以下使用自定义类型Person演示");
        Person p1 = new Person("小明");
        Person p2 = Person.buildPerson("小明");
        System.out.println(p1 == p2);


        Person p3 = new Person("李华");
        p3.intern();
        Person p4 = Person.buildPerson("李华");
        System.out.println(p3 == p4);

        System.out.println("\n以下使用String演示\n");
        String s1 = new String("1") + new String("2");
        String s2 = "12";
        System.out.println(s1 == s2);

        String s3 = new String("3") + new String("4");
        s3.intern();
        String s4 = "34";
        System.out.println(s3 == s4);

            Scanner scanner = new Scanner(System.in);
                while(scanner.hasNext()){
                    System.out.println(scanner.next()+scanner.next());
                }
    }


}
