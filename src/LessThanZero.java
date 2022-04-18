import java.util.Scanner;

public class LessThanZero {
    public static void main(String[] args) {
        int value;  // a user enterd value between 0 to 100
        Scanner in =new  Scanner(System.in);
        do {
            System.out.print("Enter number between 0 to 100:");
            value=in.nextInt();
        }
        while (value>=0 || value<-100);
        //if the user enter a number LessThanZero the program  will ask agein to enter the number

    }}
