package Orientaatio1;

import java.util.LinkedList;
import java.util.Scanner;

public class Orientation1_4 {
    private int id;
    private long startTime;
    private long endTime;

    public Orientation1_4(int id, long startTime, long endTime) {
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
        Orientation1_4 customer1 = new Orientation1_4(1, System.currentTimeMillis(), System.currentTimeMillis());
        Orientation1_4 customer2 = new Orientation1_4(2, System.currentTimeMillis(), System.currentTimeMillis());

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