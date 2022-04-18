import java.util.Scanner;

public class Oover {
    public static void main(String[] args) {
        int value;  // a user enterd value between 0 to 100
        Scanner in =new  Scanner(System.in);
        do {
            System.out.print("Enter number between 100 to 1000:");
            value=in.nextInt();
        }
        while (value>=1000 || value<100);//if the user enter a number over 100 will ask agein to enter the number and also the same to under 0
    }
}
