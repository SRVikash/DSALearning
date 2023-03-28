package HackerEarth;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "01:05:45PM";
        String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minutes = parts[1];
        String secondsWithFormat = parts[2];
        
        if (secondsWithFormat.contains("PM")) {
            hour = hour < 12 ? hour + 12 : hour;
            secondsWithFormat = secondsWithFormat.replace("PM", "");
        } else if (secondsWithFormat.contains("AM")) {
            hour = hour >= 12 ? hour - 12 : hour;
            secondsWithFormat = secondsWithFormat.replace("AM", "");
            if (hour < 10) {
                hour = Integer.parseInt("0" + hour);
            }
        }
        System.out.println(String.format("%02d:%s:%s", hour, minutes, secondsWithFormat));
    }
}
