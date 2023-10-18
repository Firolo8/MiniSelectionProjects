import java.util.Scanner;

public class RockPaperScissors {
    private int computer;
    private String computerChoice;

    public RockPaperScissors(int playerChoice){
        int computer = (int) Math.random() * 3;

        if (computer == 0){
            computerChoice = "rock";
        }
        else if (computer == 1){
            computerChoice = "paper";
        }
        else if (computer == 2){
            computerChoice = "scissors";
        }

        System.out.println("Computer played " + computerChoice +"." );

        if (computer == playerChoice){
            System.out.println("It's a draw!");
        }
        else if (computer == 0 && playerChoice == 1){
            System.out.println("Paper beats rock, you win!");
        }
        else if( computer == 0 && playerChoice == 2){
            System.out.print("Rock beats scissors, you lose!");
        }
        else if (computer == 1 && playerChoice == 0){
            System.out.println("Paper beats rock, you lose!");
        }
        else if (computer == 1 && playerChoice == 2){
            System.out.println("Scissors beats rock, you win!");
        }
        else if (computer == 2 && playerChoice == 0){
            System.out.println("Rock beats scissors, you win!");
        }
        else if (computer == 2 && playerChoice == 1){
            System.out.println("Scissors beats paper, you lose");
        }

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play rock, paper, scissors! Rock (0), Paper (1), Scissors (2): 0");
        int choice = scan.nextInt();
        RockPaperScissors  g = new RockPaperScissors(choice);




    }


}
