package CodingExercises;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (double kilobytes) {
        double conversionToMB = kilobytes / 1024;
        double remainder = conversionToMB % 2;
//        remainder *= 1000;
        System.out.println("conversionToMB = " + conversionToMB);
        System.out.println("remainder = " + remainder);

        if (remainder > 0) {
            System.out.printf("%s KB=%s MB and %s KB%n", Math.round(kilobytes), Math.round(conversionToMB - remainder), Math.round(remainder * 1000));
        } else {
            System.out.printf("%s KB=%s MB%n", kilobytes, conversionToMB);
        }

    }
}
