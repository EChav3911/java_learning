public class SecondsAndMinutesChallenge {

    static void main() {

        int seconds = -999;

        getDurationString(seconds);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
        System.out.println("invalid input");
        return "invalid input";
        }

        int minutes = seconds / 60;

        return getDurationString(minutes, seconds);
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 && (seconds < 0 || seconds > 59)) {
            System.out.println("invalid input");
            return "invalid input";
        }


        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        System.out.println(hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
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
