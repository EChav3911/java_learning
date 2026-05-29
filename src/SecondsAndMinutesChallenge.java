public class SecondsAndMinutesChallenge {

    static void main() {

        int minutes = 190;
        int seconds = 44;

        //getDurationString(minutes, seconds);
        getDurationString(getDurationString(minutes, seconds));
    }

    public static void getDurationString(int seconds){

        int minutes = seconds/60;
        int hours = minutes/60;
        seconds = seconds - (minutes * 60);
        minutes = minutes - (hours * 60);

        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
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
