//Michael G
//Date: 2/12/2025
//Main file for physics program

package labs.example.physics;

import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Physics physics = new Physics(); 

        System.out.println("Distance is "+physics.getDistance(17, 1)+ " miles.");
        System.out.println("Velocity is "+physics.getVelocity(12, 4)+ " mph.");
        System.out.println("Momentum is "+physics.getMomentum(0.23, 71002)+ " kg m/s.");
        System.out.println("Force is "+physics.getForce(120, 9001)+ " kg m/s^2.");
        System.out.println("Work is "+physics.getWork(750, 1500)+ " Joules.");
        System.out.println("Kinetic Energy is "+physics.getKineticEnergy(0.22, 2525)+ " Joule.");
        System.out.println("Potential Energy is "+physics.getPotentialEnergy(0.22, 15000)+ " Joule.");
        
    }
}