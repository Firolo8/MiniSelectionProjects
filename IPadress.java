import java.util.Scanner;

public class IPadress {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first octet: ");
        int firstoct = scan.nextInt();

        System.out.println("Please enter the second octet: ");
        int secondoct = scan.nextInt();

        System.out.println("Please enter the third octet: ");
        int thirdoct = scan.nextInt();

        System.out.println("Please enter the fourth");
        int fourthoct = scan.nextInt();

        boolean correct = true;


        if (firstoct  > 255 || firstoct < 0){
            //firstoct = -1;
            System.out.println("Octet 1 is incorrect");
            correct = false;
        }
        if (secondoct  > 255 || secondoct < 0){

            System.out.println("Octet 2 is incorrect");
            correct = false;

        }
        if (thirdoct  > 255 || thirdoct < 0){

            System.out.println("Octet 3 is incorrect");
            correct = false;

        }
        if (fourthoct  > 255 || fourthoct < 0){

            System.out.println("Octet 4 is incorrect");
            correct = false;

        }
        
        if(correct)
        {
            System.out.println("IP Address: " + firstoct + "." + secondoct +"." + thirdoct +"."+fourthoct);
        }


    }

}
