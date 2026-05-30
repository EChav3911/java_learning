public class SecondsAndMinutesChallenge {

    static void main() {

        System.out.println(getDurationString(56987));
        System.out.println(getDurationString(445, 652));
        System.out.println(getDurationString(998, 42));
        System.out.println(getDurationString(-229));
        System.out.println(getDurationString(-4, 33));
        System.out.println(getDurationString(56, 33));
        System.out.println(getDurationString(56, -6));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Seconds input (" + seconds + ") should be equal to or greater than 0";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0){
            return "Minute input (" + minutes + ") should be equal to or greater than 0";
        }

        if (seconds < 0 || seconds > 59) {
            return "Seconds input (" + seconds + ") should be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }




//    public static void getDurationString(int seconds){
//
//        int totalMinutes = seconds/60;
//        int totalHours = seconds/3600;
//        int secondsLeftOver = seconds - (totalMinutes * 60);
//        int minutesLeftOver = totalMinutes - (totalHours * 60);
//
//        System.out.println(totalHours + "h " + minutesLeftOver + "m " + secondsLeftOver + "s");
//    }
//
//    public static int getDurationString(int minutes, int seconds){
//
//        int totalSeconds = -1;
//
//        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
//
//            int minutesToSeconds = minutes * 60;
//            totalSeconds = minutesToSeconds + seconds;
//
//            System.out.println(0+"h " + 0+"m " + totalSeconds+"s");
//        }else {
//            System.out.println("invalid entry");
//        }
//
//        return totalSeconds;
//    }
}
