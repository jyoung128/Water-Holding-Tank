package edu.cscc;
/*
Jonah Young
9/24/2019
Simulates a water holding tank with a class
 */
public class Main {

    public static void main(String[] args) {
        HoldingTank tank = new HoldingTank(600, 1000);

        tank.print();
        tank.add(300);
        tank.drain(50);
        tank.print();
        tank.add(500);
        tank.drain(250);
        tank.print();
        tank.drain(1200);
        tank.add(200);
        tank.drain(25);
        tank.print();
    }
}
