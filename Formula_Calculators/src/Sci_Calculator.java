import java.util.Scanner;

public class Sci_Calculator{

    public static double calculateDistance(double x1, double x2, double y1, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static double calculateWattHours(double ampHours, double voltage) {
        return ampHours * voltage;
    }

    public static double calculateMotorTorque(double power, double rpm) {
        if (rpm == 0) {
            return 0.0;
        }
        return (power * 60) / (2 * Math.PI * rpm);
    }

    public static double calculatePackVoltage(double cellVoltage, int seriesCells) {
        return cellVoltage * seriesCells;
    }

    public static double calculateTensileStress(double force, double area) {
        if (area == 0) {
            return 0.0;
        }
        return force / area;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("PICK A FORMULA:");
        System.out.println("\t1) Distance Calculator                                   d = √((x₂ - x₁)² + (y₂ - y₁)²)\n" +
                "\t2) Watt-Hours Calculator                                 wh = ah * V\n" +
                "\t3) Motor Torque Calculator                               τ = (P * 60) / (2 * π * rpm)\n" +
                "\t4) Nominal Voltage of Battery Pack Calculator            V pack =  V cell * number of cells in series\n" +
                "\t5) Tensile Stress Calculator                             sigma = F/A\n");
        System.out.print("NUMBER: ");
        String option_num = sc.nextLine();
        System.out.println();

        if(option_num.equals("1")){
            System.out.println("DISTANCE CALCULATOR:");

            System.out.print("\tValue of x1: ");
            double x1 = sc.nextDouble();
            System.out.print("\tValue of x2: ");
            double x2 = sc.nextDouble();
            System.out.print("\tValue of y1: ");
            double y1 = sc.nextDouble();
            System.out.print("\tValue of y2: ");
            double y2 = sc.nextDouble();

            double result = calculateDistance(x1, x2, y1, y2);
            System.out.println("\n\t ->    The distance is: " + result);

        } else if (option_num.equals("2")) {
            System.out.println("WATT-HOURS CALCULATOR:");

            System.out.print("\tValue of ampHours: ");
            double ampHours = sc.nextDouble();
            System.out.print("\tValue of voltage: ");
            double voltage = sc.nextDouble();

            double resultWatts = calculateWattHours(ampHours, voltage);
            double resultAh = resultWatts / voltage;
            System.out.println("\n\t ->    The battery capacity is: " +  resultWatts + " Wh /" + resultAh + " Ah");

        } else if (option_num.equals("3")) {
            System.out.println("MOTOR TORQUE CALCULATOR:");

            System.out.print("\tValue of motor power: ");
            double power = sc.nextDouble();
            System.out.print("\tValue of rpm: ");
            double rpm = sc.nextDouble();

            double result = calculateMotorTorque(power, rpm);
            System.out.println("\n\t->    The motor torque is: " + result);
        }else if (option_num.equals("4")){
            System.out.println("NOMINAL BATTERY PACK CALCULATOR:");

            System.out.print("\tValue of voltage cell (eg. 3.7): ");
            double cell = sc.nextDouble();
            System.out.print("\tNumber of series cells: ");
            int series = sc.nextInt();

            double result = calculatePackVoltage(cell, series);
            System.out.println("\n\t->    The nominal battery pack voltage is: " + result);
        } else if (option_num.equals("5")) {
            System.out.println("TENSILE STRESS CALCULATOR:");

            System.out.print("\tValue of force: ");
            double force = sc.nextDouble();
            System.out.print("\tValue of area: ");
            double area = sc.nextDouble();

            double result = calculateTensileStress(force, area);
            System.out.println("\n\t->    The tensile stress is: " + result);
        }else {
            System.out.println("WRONG INPUT! (only 1 to 5)...");
            return;
        }

    }
}