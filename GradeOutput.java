import java.util.Scanner;

public class GradeOutput {
private int grade1;

public GradeOutput(int grade)
        {
            grade1 = grade;

            if (grade1 <= 100 && grade1 >=98 ){
                System.out.println("A+");
            }
            else if (grade1 <= 97 && grade1 >= 93 ){
                System.out.println("A");
            }
            else if (grade1 >= 90 ){
                System.out.println("-A");
            }
            else if (grade1 >= 88 ){
                System.out.println("B+");
            }
            else if (grade1 >= 83 ){
                System.out.println("B");
            }
            else if (grade1 >= 80 ){
                System.out.println("-B");
            }
            else if (grade1 >= 78 ){
                System.out.println("C+");
            }
            else if (grade1 >= 73 ){
                System.out.println("C");
            }
            else if (grade1 >= 70 ){
                System.out.println("C-");
            }
            else if (grade1 >= 68 ){
                System.out.println("D+");
            }
            else if (grade1 >= 63 ){
                System.out.println("D");
            }
            else if (grade1 >= 60 ){
                System.out.println("D-");
            }
            else if (grade1 <= 59 ){
                System.out.println("F");
            }
        }


    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter in your grade as an integer: ");
    int gradeInput = scan.nextInt();
    GradeOutput g = new GradeOutput(gradeInput);




    }
}


