import java.util.Scanner;
public class TheMarks{
  public static void main(String[] args){
    Scanner userinput = new Scanner(System.in);
    System.out.println("Please enter your mark: ");
    int mark = userinput.nextInt();

    if (mark < 25){
      System.out.println("F");
    } else if (25 <= mark && mark <= 44){
      System.out.println("E");
    } else if (45 <= mark && mark <= 49){
      System.out.println("D");
    } else if (50 <= mark && mark <= 59){
      System.out.println("C");
    } else if (60 <= mark && mark <= 79){
      System.out.println("B");
    } else if (80 <= mark && mark <= 100){
      System.out.println("A");
    } else {
      System.out.println("The value you entered is not in range.");
    }
  }
}
