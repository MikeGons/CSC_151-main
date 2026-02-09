/*Name: Michael G 
Date: 2/9/2026
Purpose: Defining gravity as a class by using different mathematical equations to reach it. 
*/

package labs.example.physics;
import java.lang.math;

public class Physics {
    final static double GRAVITY = 9.81;

    public static double getDistance(double v, double t){
        double x = v * t;
        return x;
    }

    public static double getLightSpeedInMPH(){
        double lightSpeed = getSpeedOfLightInMPS() * 60 * 60;
        return lightSpeed;
    }

    public static double getTimeFromSunToEarthInHours(){
        double timeToEarth = (getKnownDistanceToEarth() / getSpeedOfLightInMPS()) / 3600;
        return timeToEarth;
    }

    public static double getSpeedOfLightInMPS(){
        double c = 186282;
        return c;
    }

    public static double getKnownDistanceToEarth(){
        return 92947266.72;
    }



    public static double getVelocity(double distance, int time){
        double velocity = distance / time;
        return velocity;
    }
    public static double getMomentum(int mass, int velocity){
        double p = mass * velocity;
        return p;
    }
    public static double getTheta(int xVal, int yVal){
        double theta = Math.atan2(xVal,yVal) * 180/3.1415;
        return theta;
    }
    public static double getForce(int mass, int acceleration){
        double force = mass * acceleration;
        return force;
    }






}