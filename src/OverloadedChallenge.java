public class OverloadedChallenge {

    static void main() {

        int feet = 5;
        int inches = 11;

        System.out.println (convertToCentimeters(feet, inches) + "cm");
    }

    public static double convertToCentimeters(int inches) {

        double inchesToCentimeters = inches * 2.54;
        return inchesToCentimeters;
    }

    public static double convertToCentimeters(int feet, int inches ) {

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;

        return convertToCentimeters(totalInches);
    }

}
