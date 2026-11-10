public class EvenOdd
{
    public static void main(String[] args)
    {
        // Set the number to examine (later we would input this)
        // Use modulo 2 to get the remainder
        // A remainder of 0 means the number is even, a remainder of 1 means it is odd

        int numToExamine = 2;
        int remainder = 0;
        boolean isEven = false;

        remainder = numToExamine % 2;
        isEven = remainder == 0;

        System.out.println("The number to examine is: " + numToExamine);
        System.out.println(numToExamine + " mod 2 is " + remainder + " (0 means even, 1 means odd)");
        System.out.println("Is " + numToExamine + " an even number? " + isEven);
    }
}
