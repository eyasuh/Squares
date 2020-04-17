import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //prompt user for number
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        //Build the table
        System.out.println("Number      Square \n-------    -------");
        //use for loop to iterate from 1 to num and print the square
        for(int i = 1; i <= num; i++) {
            System.out.println(i + "\t\t\t" + i*i);
        }
    }
}
