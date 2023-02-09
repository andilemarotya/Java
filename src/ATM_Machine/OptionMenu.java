package ATM_Machine;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(952141, 191904);
                data.put(989947, 71976);

                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your customer number");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your PIN Number: ");
                setPinNumber(menuInput.nextInt());

            }catch (Exception e){
                System.out.println("\n"+"Invalid Character(s). Only Numbers."+ "\n");
                x=2;
            }


            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            } else {
                System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
            }
        }while (x == 1);
    }
    public void getAccountType() {
        System.out.println("Select the Account you want to Access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank You for using this ATM, bye. \n");

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("ace");
    }

    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("Type 1: View Balance");

    }
}
