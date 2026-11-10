public class YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        // Set the maintenance cost for each of the four seasons
        // Add the four costs to get the yearly total
        // Display each seasonal cost and the yearly total

        double springCost = 250.00;   // Later we would input these
        double summerCost = 400.00;
        double fallCost = 300.00;
        double winterCost = 550.00;
        double yearlyCost = 0;

        yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("The total yearly maintenance cost is: $" + yearlyCost);
    }
}
