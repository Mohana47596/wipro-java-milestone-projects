public class RDAccount extends Account {

    private int months;
    private double monthlyAmount;
    private int age;

    public RDAccount(double monthlyAmount, int months, int age) {
        this.monthlyAmount = monthlyAmount;
        this.months = months;
        this.age = age;
    }

    public double calculateInterest() {

        boolean isSenior = age >= 60;

        switch (months) {
            case 6:
                interestRate = isSenior ? 8.00 : 7.50;
                break;
            case 9:
                interestRate = isSenior ? 8.25 : 7.75;
                break;
            case 12:
                interestRate = isSenior ? 8.50 : 8.00;
                break;
            case 15:
                interestRate = isSenior ? 8.75 : 8.25;
                break;
            case 18:
                interestRate = isSenior ? 9.00 : 8.50;
                break;
            case 21:
                interestRate = isSenior ? 9.25 : 8.75;
                break;
        }

        amount = monthlyAmount * months;
        return amount * interestRate / 100;
    }
}
