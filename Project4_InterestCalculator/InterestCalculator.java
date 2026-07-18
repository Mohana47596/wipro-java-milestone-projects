import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("---------");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");
            System.out.print("Enter your option (1..4): ");
            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter the Average amount in your account: ");
                        double sbAmount = sc.nextDouble();
                        if (sbAmount < 0) {
                            throw new InvalidAmountException("Invalid Amount.");
                        }
                        System.out.print("Enter Account Type (Normal/NRI): ");
                        String accType = sc.next();
                        SBAccount sbAccount = new SBAccount(sbAmount, accType);
                        System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
                        break;

                    case 2:
                        System.out.print("Enter the FD amount: ");
                        double fdAmount = sc.nextDouble();
                        if (fdAmount < 0) {
                            throw new InvalidAmountException("Invalid Amount.");
                        }
                        System.out.print("Enter the number of days: ");
                        int fdDays = sc.nextInt();
                        if (fdDays < 0) {
                            throw new InvalidAmountException("Invalid Number of days. Please enter non-negative values.");
                        }
                        System.out.print("Enter your age: ");
                        int fdAge = sc.nextInt();
                        if (fdAge < 0) {
                            throw new InvalidAmountException("Invalid Age.");
                        }
                        FDAccount fdAccount = new FDAccount(fdAmount, fdDays, fdAge);
                        System.out.println("Interest gained is: Rs. " + fdAccount.calculateInterest());
                        break;

                    case 3:
                        System.out.print("Enter the Monthly amount: ");
                        double rdAmount = sc.nextDouble();
                        if (rdAmount < 0) {
                            throw new InvalidAmountException("Invalid Amount.");
                        }
                        System.out.print("Enter the number of months: ");
                        int rdMonths = sc.nextInt();
                        if (rdMonths < 0) {
                            throw new InvalidAmountException("Invalid Months.");
                        }
                        System.out.print("Enter your age: ");
                        int rdAge = sc.nextInt();
                        if (rdAge < 0) {
                            throw new InvalidAmountException("Invalid Age.");
                        }
                        RDAccount rdAccount = new RDAccount(rdAmount, rdMonths, rdAge);
                        System.out.println("Interest gained is: Rs. " + rdAccount.calculateInterest());
                        break;

                    case 4:
                        System.out.println("Thank You.");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
