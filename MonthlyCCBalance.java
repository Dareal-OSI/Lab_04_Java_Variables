public class MonthlyCCBalance
{
    public static void main(String[] args)
    {
        // Start with a balance of $5000 and a yearly interest rate of 17%
        // The monthly rate is the yearly rate divided by 12
        // Month 1: interest = balance * monthly rate, then add it to the balance
        // Month 2: interest = new balance * monthly rate, then add it to the balance
        // Display the interest due after one month and after two months

        double balance = 5000.00;
        final double YEARLY_RATE = 0.17;
        double monthlyRate = YEARLY_RATE / 12;
        double interestMonthOne = 0;
        double interestMonthTwo = 0;

        System.out.println("Starting credit card balance: $" + balance);
        System.out.println("Yearly interest rate: " + (YEARLY_RATE * 100) + "%");

        // No payments are made, so the interest is added to the balance
        interestMonthOne = balance * monthlyRate;
        balance = balance + interestMonthOne;
        System.out.printf("The interest due after one month is: $%.2f%n", interestMonthOne);
        System.out.printf("The balance after one month is: $%.2f%n", balance);

        interestMonthTwo = balance * monthlyRate;
        balance = balance + interestMonthTwo;
        System.out.printf("The interest due for the second month is: $%.2f%n", interestMonthTwo);
        System.out.printf("The total interest due after two months is: $%.2f%n", interestMonthOne + interestMonthTwo);
        System.out.printf("The balance after two months is: $%.2f%n", balance);
    }
}
