import java.util.Scanner;

public class OverOneHandred {
    public static void main(String[] args) {
        int value;  // a user enterd value between 0 to 100
        Scanner in =new  Scanner(System.in);
        do {
            System.out.print("Enter number between 1000 and over:");
            value=in.nextInt();
        }
        while (value>=50000 || value<1000);
    }
}
