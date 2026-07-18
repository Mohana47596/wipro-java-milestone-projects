public class FDAccount extends Account {

    private int noOfDays;
    private int age;

    public FDAccount(double amount, int noOfDays, int age) {
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.age = age;
    }

    public double calculateInterest() {

        boolean isSenior = age >= 60;

        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = isSenior ? 5.00 : 4.50;
            } else if (noOfDays <= 29) {
                interestRate = isSenior ? 5.25 : 4.75;
            } else if (noOfDays <= 45) {
                interestRate = isSenior ? 6.00 : 5.50;
            } else if (noOfDays <= 60) {
                interestRate = isSenior ? 7.50 : 7.00;
            } else if (noOfDays <= 184) {
                interestRate = isSenior ? 8.00 : 7.50;
            } else if (noOfDays <= 365) {
                interestRate = isSenior ? 8.50 : 8.00;
            }
        } else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 6.50;
            } else if (noOfDays <= 29) {
                interestRate = 6.75;
            } else if (noOfDays <= 45) {
                interestRate = 6.75;
            } else if (noOfDays <= 60) {
                interestRate = 8.00;
            } else if (noOfDays <= 184) {
                interestRate = 8.50;
            } else if (noOfDays <= 365) {
                interestRate = 10.00;
            }
        }

        return amount * interestRate / 100;
    }
}
