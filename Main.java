public class Main
{
    public static void main(String[] args)
    {
        // Declare and initialize the int variables
        int intOperandA = 13;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        // Declare and initialize the double variables
        double doubleOperandA = 3.50;
        double doubleOperandB = 1.25;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;

        // Arithmetic with ints
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo (remainder) using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // Arithmetic with doubles
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        // Variables with meaningful names and the right types
        double myLunchCost = 12.50;
        int kidsInFamily = 2;
        boolean isRaining = false;
        double gasPricePerGallon = 3.19;
        int favoriteNumber = 7;
        double shoeSize = 11.5;
        int birthMonth = 6;
        String fullName = "Darrell Lawson";

        System.out.println();
        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("The number of kids in my family is: " + kidsInFamily);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of a gallon of gas is: " + gasPricePerGallon);
        System.out.println("My favorite number is: " + favoriteNumber);
        System.out.println("My shoe size is: " + shoeSize);
        System.out.println("My birth month is: " + birthMonth);
        System.out.println("My full name is: " + fullName);
    }
}
