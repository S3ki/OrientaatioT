package Orientaatio3;

public class Clock {
    private static Clock instance;
    private long time;

    private Clock() {

        time = System.currentTimeMillis();
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(long newTime) {
        time = newTime;
    }

    public long getTime() {
        return time;
    }

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();


        System.out.println("Nykyinen aika: " + clock.getTime());

        // Laittaa uuden ajan
        long newTime = System.currentTimeMillis() + 10000; // Esimerkkinä 10 sekunnin eteenpäin
        clock.setTime(newTime);

        // Tulosta uusi aika
        System.out.println("Uusi aika: " + clock.getTime());
    }
}
