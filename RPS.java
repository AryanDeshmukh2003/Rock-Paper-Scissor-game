import java.util.Random;
import java.util.Scanner;

public class RPS{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int UIM, CIM, i=1;

        System.out.println("1.Rock, 2.Paper, 3.Scissor");

        System.out.println("Enter the Your Move = ");
        UIM = s.nextInt();

        Random ran = new Random();

        CIM = ran.nextInt(1,4);

        if(UIM == CIM){
            System.out.println("Draw !!");
        }
        else if(UIM == 1 && CIM == 3 || UIM == 2 && CIM == 1 || UIM == 3 && CIM == 2){
            System.out.println("You Win !!");
        }
        else{
            System.out.println("Computer Wins !!");
        }
        System.out.println("Computer Played Move is = "+(CIM));
    }
}