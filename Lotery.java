import java.util.Scanner;
public class Lotery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a two digit number. ");
        int inputNum = scan.nextInt();
        int randomNum = (int) (Math.random() * 99 )+ 1;
        System.out.println(randomNum);
        if (inputNum == randomNum) {
            System.out.println("You won!");
            System.out.println("Enter in a two digit number. ");
            inputNum = scan.nextInt();
        } else {
            System.out.println("You lost!");




        }
    }
}

