public class SecondsAndMinutesChallenge {

    static void main() {

        int minutes = 190;
        int seconds = 900;

        getDurationString(seconds);
        getDurationString(minutes, seconds);
    }

    public static void getDurationString(int seconds){

        int totalMinutes = seconds/60;
        int totalHours = seconds/3600;
        int secondsLeftOver = seconds - (totalMinutes * 60);
        int minutesLeftOver = totalMinutes - (totalHours * 60);

        System.out.println(totalHours + "h " + minutesLeftOver + "m " + secondsLeftOver + "s");
    }

    public static int getDurationString(int minutes, int seconds){

        int totalSeconds = -1;

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int minutesToSeconds = minutes * 60;
            totalSeconds = minutesToSeconds + seconds;

            System.out.println(0+"h " + 0+"m " + totalSeconds+"s");
        }else {
            System.out.println("invalid entry");
        }

        return totalSeconds;
    }
}
