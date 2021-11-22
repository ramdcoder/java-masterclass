package HelloWorld;

public class Numbers {


    public static void main(String[] args) {
        int myWeightInPounds = 220;
        int myOldWeightInKilos = 75;

        double poundInKilos = 0.454;

        double myWeightInKilos = myWeightInPounds * poundInKilos;
        double myOldWeightInPounds = myOldWeightInKilos / poundInKilos;



        System.out.printf("My weight in kilos is %.2f kilograms.", myWeightInKilos);
        System.out.println();
        System.out.printf("My old weight in pounds is %.2f pounds.", myOldWeightInPounds);
    }

}
