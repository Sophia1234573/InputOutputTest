package main.java;
import java.util.Scanner;

public class InputOutputTest {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.print("Please, input your name ");
      String name = in.nextLine();

      System.out.print("Please, input your city ");
      String city = in.nextLine();

      System.out.print("Please, input your hobby ");
      String hobby = in.nextLine();

      System.out.print("Please, input your age ");
      int age = in.nextInt();

      System.out.println();
      System.out.println("Имя: " + name);
      System.out.println("Город: " + city);
      System.out.println("Возраст: " + age);
      System.out.println("Хобби: " + hobby);

      System.out.println();
      System.out.println("Человек по имени " + name + " живет в городе " + city + ". Этому человеку лет " + age + " и любит он заниматься " + hobby + ".");

      System.out.println();
      System.out.println(name + " - имя");
      System.out.println(city + " - город");
      System.out.println(age + " - возраст");
      System.out.println(hobby + " - хобби");

      in.close();

    }
}
