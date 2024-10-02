import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double SHIPPING_RATE = .02;

        double shippingCost = 0;

        double itemPrice = 0;

        double totalCost = 0;

        String badInput = "";  //use for bad input which will read as a String

        System.out.println("Enter your item price: ");

        if (in.hasNextDouble()){

            itemPrice = in.nextDouble();

            if (itemPrice < 100){

                shippingCost = itemPrice * SHIPPING_RATE;

                totalCost = itemPrice + shippingCost;

                System.out.println("Your shipping cost is $"+shippingCost);

                System.out.println("Your total is $"+totalCost);

            }else{

                System.out.println("You qualify for free shipping!");

                System.out.println("Your total is $"+ itemPrice);

            }


        }else{

            badInput = in.nextLine();

            System.out.println("Please enter a valid input not "+badInput);

        }
    }
}
