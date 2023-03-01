 
 package frc.robot;
 import edu.wpi.first.wpilibj.BuiltInAccelerometer;
 import edu.wpi.first.wpilibj.interfaces.Accelerometer;
 import java.lang.Math;
 
 
 
 

public class AccelerometerSample {
    public Accelerometer inAccelerometer = new BuiltInAccelerometer();

    double accelerationX = 0.0;
    double accelerationY = 0.0;
    double accelerationZ = 0.0;


    public AccelerometerSample(double yaw, double row){
        
    
    }
    public void initalizeaccel(){

    }
//yaw
    public double getXY(){
        accelerationX = inAccelerometer.getX();
        accelerationY = inAccelerometer.getY();
        double angleXY = Math.atan2 (accelerationX,accelerationY);
        return angleXY * (180/Math.PI);
    }
//pitch
public double getXZ(){
    accelerationX = inAccelerometer.getX();
    accelerationZ = inAccelerometer.getZ();
    double angleXZ = Math.atan2 (accelerationX,accelerationZ);
    return angleXZ * (180/Math.PI);

}
//roll
    public double getYZ(){
        accelerationY = inAccelerometer.getY();
        accelerationZ = inAccelerometer.getZ();
        double angleYZ = Math.atan2 (accelerationY,accelerationZ);
        return angleYZ * (180/Math.PI);
    }
}
