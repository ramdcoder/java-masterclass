package SectionThree;

public class Operators {
    public static void main(String[] args) {
        // practice with ternary
//        boolean isSingle = false;
//        isSingle = true;
//
//        boolean wasSingle = isSingle ? true : false;
//
//        if (wasSingle) {
//            System.out.println("Was single is true");
//        }
//
//        boolean isEmployed = false;
//        boolean hasJob = (isEmployed == true) ? true : false;
        double num1 = 20.00;
        double num2 = 80.00;
        double sumAndMultiply = (num1 + num2) * 100;
        double remainder = sumAndMultiply % 40;
//        System.out.println("remainder = " + remainder);

//        boolean remainderIsZero = (remainder == 0) ? true : false;
        boolean remainderIsZero = remainder == 0;

        if (remainderIsZero) {
            System.out.println("remainderIsZero = " + remainderIsZero);
        } else {
            System.out.println("Some remainder");
        }
    }
}
