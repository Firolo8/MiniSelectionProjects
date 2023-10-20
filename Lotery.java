import java.util.Scanner;
public class Lotery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in a two digit number: ");
        int inNum = scan.nextInt();
        int ranNum = (int) (Math.random() * 90 ) + 10;
        System.out.println(ranNum);

        System.out.println("The lotto number is: " + ranNum);

        int rantens = ranNum / 10;
        int ranOnes = ranNum % 10;

        int usertens = inNum /10;
        int userOnces = inNum %10;



        if (inNum == ranNum) {
            System.out.println("You won!");

        }
        else if (rantens == usertens && ranOnes == userOnces)
        {
            System.out.println("You got both digits correct. \n You win $2,000" );
        }
        if (rantens == usertens || ranOnes == usertens)
        {
            System.out.println("You got one digit correct. \n You win $500");
        }
        else {
            System.out.println("You didn't win anything :(");
        }
        }
    }

