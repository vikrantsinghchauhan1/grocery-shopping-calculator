import java.sql.SQLOutput;
import java.util.Scanner;

class Main{
    public static void main() {
        System.out.println("Welcome to Vikrant Groceries");
        Scanner in =new Scanner(System.in);
        System.out.print("Number of product you have :");
        int index=in.nextInt();
        String prodName;
        int prodPrice;
        in.nextLine();
        int totalPrice =0;


        for (int i = 1; i <=index ; i++) {
            System.out.print("Product name is : ");
            prodName=in.nextLine();
            System.out.print("Price of the product : ");
            prodPrice=in.nextInt();
            System.out.print("Product : "+prodName);
            System.out.println("  Price : "+prodPrice);
            in.nextLine();
            totalPrice+=prodPrice;


        }
        System.out.println("Total price of " +index +" products is :" +totalPrice);

        System.out.println("You use cash or card ");

        String payType=in.nextLine();

        System.out.println("Successful Payment");

        System.out.println("Thankyou for Visiting Vikrant Groceries");
         in.close();
    }
}


