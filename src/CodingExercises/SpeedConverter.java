package CodingExercises;

public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {
        double oneKmhInMph = 1.609344;
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / oneKmhInMph);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.printf("Invalid Value%n");
        } else {
            System.out.printf("%s kmh = %s mph%n", kilometersPerHour, toMilesPerHour(kilometersPerHour));
        }
    }

}
