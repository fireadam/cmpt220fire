public class Problem1 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter time1 (hour minute second): ");
        Time time1 = new Time(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(time1.toString());
        System.out.println("Elapsed seconds in time1: " + time1.getSeconds());
        System.out.println("Enter time2 (elapsed time): ");
        Time time2 = new Time(input.nextInt());
        System.out.println(time2.toString());
        System.out.println("Elapsed seconds in time2: " + time2.getSeconds());
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        Time time3 = time1;
        System.out.println("time3 is created as a clone of time1");
        System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));

    }
}
class Time implements Comparable{
    private int hour;
    private int minute;
    private int second;
    private long time;

    Time(){
        time = System.currentTimeMillis();
    }
    Time(long time) {
        this.time = (time*1000);
    }
    //for time inputs
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        time = ((this.second * 1000) + (this.minute*60*1000) + (this.hour*60*60*1000));
    }
    //return times
    int getHour(){
        return (int)(time / (1000 * 60 * 60)) % 24;
    }
    int getMinute(){
        return (int)(time / (1000 * 60)) % 60;
    }
    int getSecond(){
        return (int)(time / 1000) % 60;
    }
    long getSeconds(){
        return time/1000;
    }
    //return string of times
    @Override
    public String toString(){
        return getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds ";
    }
    //method to compare 2 times
    public int compareTo(Object temp){
        Time other = (Time) temp;
        if(getSeconds() > other.getSeconds()){
            return ((int)other.getSeconds()-(int)getSeconds());
        }
        else if (other.getSeconds() > getSeconds()){
            return ((int)getSeconds()-(int)other.getSeconds());
        }
        else{
            return 0;
        }
    }
}