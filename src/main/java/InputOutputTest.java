package main.java;
import java.util.Scanner;

public class InputOutputTest {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Please, input your name ");
      String name = in.nextLine();

      System.out.print("Please, input your city ");
      String city = in.nextLine();

      System.out.print("Please, input your age ");
      int age = in.nextInt();

      System.out.print("Please, input your hobbies ");
      String hobbies = in.nextLine();

      System.out.printf("Имя: %s /n Город: %s /n Возраст: %d /n Хобби: %s /n", name, city, age, hobbies);
      System.out.println("Человек по имени " + name + " живет в городе " + city + ". Этому человеку лет " + age + " и любит он заниматься " + hobbies + ".");
      System.out.printf("%s - имя %s - город %d - возраст %s - хобби /n", name, city, age, hobbies);
      in.close();
    }
}
