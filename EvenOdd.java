import java.util.Scanner;
public class EvenOdd{

    public static void main(String args[]){

        int n;
        System.out.print("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        if(n % 2 == 0)
        {
            System.out.println(n + " is a even number.");
        }
        else
        {
            System.out.println(n + " is a odd number.");
        }

    }

}