import java.util.Scanner;

public class TimeDriver {
    // Write your code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long elapseTime = sc.nextLong();
        Time t = new Time(elapseTime);
        System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
    }

}

class Time {
    // Write your code here
    private long hour;
    private long minute;
    private long second;

    public Time() {
        setTime(System.currentTimeMillis());
    }

    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
    }

}