import java.util.Scanner;

public class Main {

    public static double calculatePWD_SeniorDiscounts(double current_price){
        double discountPercent = 20; // 20%
        return current_price - (current_price * discountPercent / 100);
    }

    public static double getFood(Scanner sc){
        String menu = "Snacks:\n" +
                "\t1. Potato Chips .......... 50 PHP\n" +
                "\t2. French Fries .......... 70 PHP\n" +
                "\t3. Chicken Nuggets ....... 90 PHP\n" +
                "\t4. Mini Pizza ............ 80 PHP\n" +
                "\t5. Burger Sliders ........ 100 PHP\n" +
                "\t6. Hotdog Roll ........... 60 PHP\n" +
                "\t7. Cheese Sticks ......... 75 PHP\n" +
                "\t8. Popcorn ............... 40 PHP\n" +
                "\t9. Sandwich .............. 85 PHP\n" +
                "\t10. Onion Rings .......... 65 PHP\n\n" +
                "FOR NO SNACKS, ENTER ANY NUMBER/CHARACTER (OUTSIDE VALID FOOD RANGE)\n";
        System.out.println(menu);

        System.out.print("Enter your preferred food number: ");
        try{
            byte food_num = sc.nextByte();
            switch(food_num) {
                case 1: System.out.println("\t✅ You chose Potato Chips!"); return 50.0;
                case 2: System.out.println("\t✅ You chose French Fries!"); return 70.0;
                case 3: System.out.println("\t✅ You chose Chicken Nuggets!"); return 90.0;
                case 4: System.out.println("\t✅ You chose Mini Pizza!"); return 80.0;
                case 5: System.out.println("\t✅ You chose Burger Sliders!"); return 100.0;
                case 6: System.out.println("\t✅ You chose Hotdog Roll!"); return 60.0;
                case 7: System.out.println("\t✅ You chose Cheese Sticks!"); return 75.0;
                case 8: System.out.println("\t✅ You chose Popcorn!"); return 40.0;
                case 9: System.out.println("\t✅ You chose Sandwich!"); return 85.0;
                case 10: System.out.println("\t✅ You chose Onion Rings!"); return 65.0;
                default:
                    System.out.println("\t⚠️  Invalid number! No snacks will be added.");
                    return 0;
            }
        } catch(Exception ex){
            System.out.println("\t❌ No snacks!");
            sc.next();
            return 0;
        }
    }

    public static double getDrink(Scanner sc){
        String menu = "Drinks:\n" +
                "\t1. Water ................ 20 PHP\n" +
                "\t2. Soda .................. 35 PHP\n" +
                "\t3. Iced Tea .............. 40 PHP\n" +
                "\t4. Lemonade .............. 45 PHP\n" +
                "\t5. Coffee ................ 50 PHP\n" +
                "\t6. Milkshake ............. 70 PHP\n" +
                "\t7. Smoothie .............. 80 PHP\n" +
                "\t8. Juice ................ 55 PHP\n" +
                "\t9. Hot Chocolate ......... 60 PHP\n" +
                "\t10. Energy Drink ......... 90 PHP\n\n" +
                "FOR NO DRINKS, ENTER ANY NUMBER/CHARACTER (OUTSIDE VALID DRINK RANGE)\n";

        System.out.println(menu);
        System.out.print("Enter your preferred drink number: ");

        try{
            byte drink_num = sc.nextByte();
            switch(drink_num) {
                case 1: System.out.println("\t✅ You chose Water!"); return 20.0;
                case 2: System.out.println("\t✅ You chose Soda!"); return 35.0;
                case 3: System.out.println("\t✅ You chose Iced Tea!"); return 40.0;
                case 4: System.out.println("\t✅ You chose Lemonade!"); return 45.0;
                case 5: System.out.println("\t✅ You chose Coffee!"); return 50.0;
                case 6: System.out.println("\t✅ You chose Milkshake!"); return 70.0;
                case 7: System.out.println("\t✅ You chose Smoothie!"); return 80.0;
                case 8: System.out.println("\t✅ You chose Juice!"); return 55.0;
                case 9: System.out.println("\t✅ You chose Hot Chocolate!"); return 60.0;
                case 10: System.out.println("\t✅ You chose Energy Drink!"); return 90.0;
                default:
                    System.out.println("\t⚠️  Invalid number! No drinks will be added.");
                    return 0;
            }
        }catch(Exception ex){
            System.out.println("\t❌ No drinks!");
            sc.next();
            return 0;
        }
    }

    public static byte getAddon(Scanner sc){
        String menu = "Add-ons:\n" +
                "\t1. Extra Cheese ........ 20 PHP\n" +
                "\t2. Ketchup ............. 5 PHP\n" +
                "\t3. Mayo ................ 10 PHP\n\n" +
                "FOR NO ADD-ONS, ENTER ANY NUMBER/CHARACTER (OUTSIDE VALID ADD-ON RANGE)\n";
        System.out.println(menu);

        System.out.print("Enter your preferred add-on number: ");
        try{
            byte add_num = sc.nextByte();
            switch(add_num){
                case 1: System.out.println("\t✅ You chose Extra Cheese!"); return 20;
                case 2: System.out.println("\t✅ You chose Ketchup!"); return 5;
                case 3: System.out.println("\t✅ You chose Mayo!"); return 10;
                default:
                    System.out.println("\t⚠️  Invalid number! No add-ons will be added.");
                    return 0;
            }
        }catch(Exception ex){
            System.out.println("\t❌ No add-ons!");
            sc.next();
            return 0;
        }
    }

    public static void main(String[] args) {
        boolean valid_addons = false;

        Scanner sc = new Scanner(System.in);
        double current_price = 0;
        double temp_added = 0;

        String header = "╔══════════════════════════╗\n" +
                "║     🍴 KC-inderyan 🍰    ║\n" +
                "╚══════════════════════════╝\n" +
                "   ╚> \"Gusto mo ba ng MASARAP na *swak* sa budget (pero MALINIS)? Welcome to KC-inderyan! 🍔🍟🍕\"\n";
        String greetings = "👨: Hi, Sir/Ma'am! Anong snacks gusto niyo?\n";

        System.out.println(header);
        System.out.println(greetings);

        // Snacks
        temp_added = getFood(sc);
        current_price += temp_added;
        if(temp_added > 0){
            valid_addons = true;
            System.out.println();
        }

        // Drinks
        temp_added = getDrink(sc);
        current_price += temp_added;



        if(current_price == 0.00){
            System.out.println();
            System.out.println("🍴 Wala ka naman in-order eh.. 😋");
            return;
        }

        if(valid_addons){
            // Add-ons
            System.out.println();
            byte addon_price = getAddon(sc);
            current_price += addon_price;
        }

        System.out.print("\nDo you have a PWD or Senior Citizen discount? (Y/N): ");
        String discountChoice = sc.next();
        if(discountChoice.equalsIgnoreCase("Y") || discountChoice.equalsIgnoreCase("N")){
            System.out.println("\n\t💰 Your original price: " + current_price + " PHP (before -20%)");
            current_price = calculatePWD_SeniorDiscounts(current_price);
        }else{
            System.out.println("\t⚠️  Invalid input! Re-ordering..");
            return;
        }

        System.out.println("\t💰 Your total price: " + current_price + " PHP");
        System.out.print("\nEnter Payment Amount: ");
        try{
            double pay_amount = sc.nextDouble();
            if(pay_amount < current_price) {
                System.out.println("\t⚠️  Invalid amount! Re-ordering..");
                return;
            }

            System.out.println("\t💰 Your change: " + (pay_amount - current_price)+ " PHP");
                System.out.println("\n🍴 Salamat sa pag-order! Order ka pa.. " + current_price + " PHP lang? 😋");

        }catch(Exception ex){
            System.out.println("\t⚠️  Invalid input! Re-ordering..");
            return;
        }
        return;
    }
}
