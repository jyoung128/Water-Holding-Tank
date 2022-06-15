package edu.cscc;
/*
Jonah Young
9/24/2019
Simulates a water holding tank with a class
 */
public class HoldingTank {
    private int current, maxCapacity;

    public HoldingTank(int current, int maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;
    }

    public int getCurrent() {
        return (current);
    }

    public int getMaxCapacity() {
        return (maxCapacity);
    }

    public void add(int volume) {
        if (current + volume > maxCapacity) {

            current = maxCapacity;

        } else {

            current = current + volume;
        }

    }

    public void drain(int volume) {
        if (current - volume < 0) {

            current = 0;

        } else {

            current = current - volume;

        }

    }

    public void print() {
        System.out.println("The tank volume is " + current + " gallons");
    }
}
