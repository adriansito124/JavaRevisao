public class Time {
    private long ticks = 0;
    static final long secondTicks = 1000;
    static final long minuteTicks = secondTicks * 60;
    static final long hourTicks = minuteTicks * 60;
    static final long dayTicks = hourTicks * 24;
    static final long yearTicks = 1000 * 60 * 60 * 24 * 365;
    
    public Time(long ticks) {
        this.ticks = ticks;
    }

    public Time(Time time) {
        this.ticks = time.ticks;
    }

    public Time(
        int year, int dayOfYear,
        int hour, int minute, int second
    ){
        ticks =
            yearTicks * year + dayTicks * dayOfYear +
            hourTicks * hour + minuteTicks * minute +
            secondTicks * second;
    }

    public int getYear(){
        return (int)(ticks / yearTicks) + 1970;
    }

    public int getDay(){
        long rest = ticks % yearTicks;
        return (int)(rest / dayTicks);
    }

    public int getTotalSeconds() {
        return (int)(ticks / 1000);
    }

    public int getHour() {
        long rest = ticks % dayTicks;
        return(int)(rest / hourTicks);
    }

    public int getMinute() {
        long rest = ticks % hourTicks;
        return(int)(rest / minuteTicks);
    }

    public int getSeconds() {
        long rest = ticks % minuteTicks;
        return(int)(rest / minuteTicks);
    }

    public void addSeconds(int seconds) {
        this.ticks += secondTicks * seconds;
    }

    public boolean isBiggerThan(Time other) {
        return this.ticks > other.ticks;
    }

    public static Time now(){
        return null;
    }
}
