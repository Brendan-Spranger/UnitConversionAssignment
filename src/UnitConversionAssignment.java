import java.util.Scanner;

public class UnitConversionAssignment {

    public static float unitConverter(String inputUnit, String targetUnit, float inputNum) {
        float targetNum = -1;
        float lengthInMeters;
        // This switch statement will convert the user's input value to a length in meters.
        switch (inputUnit) {
            case "km":
                lengthInMeters = inputNum * 1000;
                break;
            case "m":
                lengthInMeters = inputNum;
                break;
            case "cm":
                lengthInMeters = inputNum / 100;
                break;
            case "mm":
                lengthInMeters = inputNum / 1000;
                break;
            case "mi":
                lengthInMeters = inputNum * (float) 1609.34;
                break;
            case "yd":
                lengthInMeters = inputNum / (float) 1.09361;
                break;
            case "ft":
                lengthInMeters = inputNum / (float) 3.28084;
                break;
            case "in":
                lengthInMeters = inputNum / (float) 39.3701;
            default:
                System.out.println("Your input cannot be handled by the program. Please try again.");
                return targetNum;
        }
        // This switch statement will convert length in meters to the user's target unit.
        switch (targetUnit) {
            case "km":
                targetNum = lengthInMeters / 1000;
                break;
            case "m":
                targetNum = lengthInMeters;
                break;
            case "cm":
                targetNum = lengthInMeters * 100;
                break;
            case "mm":
                targetNum = lengthInMeters * 1000;
                break;
            case "mi":
                targetNum = lengthInMeters / (float) 1609.34;
                break;
            case "yd":
                targetNum = lengthInMeters * (float) 1.09361;
                break;
            case "ft":
                targetNum = lengthInMeters * (float) 3.28084;
                break;
            case "in":
                targetNum = lengthInMeters * (float) 39.3701;
            default:
                System.out.println("Your input cannot be handled by the program. Please try again.");
                return targetNum;
        }
        System.out.printf("%.2f %s = %.2f %s%n", inputNum, inputUnit, targetNum, targetUnit);
        return targetNum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nGreetings! Welcome to the Unit Conversion Tool powered by Java!");

        Scanner scnr = new Scanner(System.in);
        String inputString;
        String[] strArray;
        float inputNum;
        String inputUnit;
        String targetUnit;

        while (true) {
            System.out.println("\nPlease enter your desired conversion, for example, 1 km = ft");
            inputString = scnr.nextLine();
            if (inputString.equals("Exit") || inputString.equals("exit")) {
                System.out.println("Thank you for using the Unit Conversion Tool. Goodbye!");
                break;
            }
            strArray = inputString.split(" ");
            if (strArray.length != 4) {
                System.out.println("Your input is not valid. Please try again.");
                continue;
            } else {
                inputNum = Float.parseFloat(strArray[0]);
                inputUnit = strArray[1];
                targetUnit = strArray[3];
                unitConverter(inputUnit, targetUnit, inputNum);
            }
        }
        scnr.close();
    }
}