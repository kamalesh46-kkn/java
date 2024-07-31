class SimpleInterest {
    private double principal;
    private double rate;
    private double time;

    public SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000; 
        double rate = 5;      
        double time = 2;         
        SimpleInterest interestCalculator = new SimpleInterest(principal, rate, time);
        double interest = interestCalculator.calculateInterest();
        System.out.println("The simple interest is: " + interest);
    }
}