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
    }
}
