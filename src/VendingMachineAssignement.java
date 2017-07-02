import java.util.*;
public class VendingMachineAssignement {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

       
        System.out.println("Item 1 is tea and prize 5" +
        		"\n Item 2 is cofee and prize 10" +
        		"\n Item 3 is snaks and prize is 30" +
        		"\n Item 4 is cold drink and prize is 40" +
        		"\n Item 5 is Burger and prize is 50" +
        		"\n Item 6 is Pizza and prize is 60");
        double item1 = 5;
        double item2 = 10;
        double item3 = 30;
        double item4 = 40;
        double item5 = 50;
        double item6 = 60;

        System.out.print("Enter an item number: ");
        int item = keyboard.nextInt();

        System.out.print("Enter the amount paid in coin 1 ,2,5: ");
        int d=1;
        if(d!=1)
        {
        	System.out.println("Please enter amount in coin 1");
        }
        double paid = keyboard.nextDouble();

        if (item == 2 || item == 4 || item == 6)
        {
            if (paid >= item2)
            {
                System.out.println("Thank you for buying item " + item + ", your change is $" + (paid-item2) + ". Please come again!");
            }
            if (paid < item2)
            {
                System.out.println("Please insert another " + "$" + (item2-paid));
            }
        }

        else if (item == 1)
        {
            if (paid >= item1) 
            {
                System.out.println("Thank you for buying item " + item + ", your change is $" + (paid-item1) + ". Please come again!");
            }
            if (paid < item1)
            {
                System.out.println("Please insert another " + "$" + (item1-paid));
            }
        }
        else if (item == 3)
        {
            if (paid >= item3) 
            {
                System.out.println("Thank you for buying item " + item + ", your change is $" + (paid-item3) + ". Please come again!");
            }
            if (paid < item3)
            {
                System.out.println("Please insert another " + "$" + (item3-paid));
            }
        }
        else if (item == 5)
        {
            if (paid >= item5) 
            {
                System.out.println("Thank you for buying item " + item + ", your change is $" + (paid-item5) + ". Please come again!");
            }
            if (paid < item5)
            {
                System.out.println("Please insert another " + "$" + (item5-paid));
            }
        
        }
    }
}
