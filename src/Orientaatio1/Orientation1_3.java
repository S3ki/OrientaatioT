package Orientaatio1;

public class Orientation1_3 {
    private int id;
    private long startTime;
    private long endTime;

    public Orientation1_3(int id, long startTime, long endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public double getTimeSpent() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Orientation1_3 customer1 = new Orientation1_3(1, System.currentTimeMillis(), System.currentTimeMillis());
        Orientation1_3 customer2 = new Orientation1_3(2, System.currentTimeMillis(), System.currentTimeMillis());

        System.out.println("Customer: " + customer1.getId());
        customer1.setStartTime(System.currentTimeMillis());
        customer1.setEndTime(System.currentTimeMillis());

        System.out.println("Time Spent: " + customer1.getTimeSpent() + " milliseconds");



        System.out.println("Customer: " + customer2.getId());
        customer2.setStartTime(System.currentTimeMillis());
        customer2.setEndTime(System.currentTimeMillis());



        System.out.println("Time Spent: " + customer2.getTimeSpent() + " milliseconds");

    }

}