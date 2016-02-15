// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4212.MyRobot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drive_TrainRight_Rear;
    public static SpeedController drive_TrainRight_Front;
    public static SpeedController drive_TrainLeft_Front;
    public static SpeedController drive_TrainLeft_Rear;
    public static RobotDrive drive_TrainRobot_Drive;
    public static SpeedController elevatorElevator;
    public static SpeedController armArm;
    public static SpeedController pickupPickup;
    public static PowerDistributionPanel sensorsPowerDistributionPanel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drive_TrainRight_Rear = new Spark(3);
        LiveWindow.addActuator("Drive_Train", "Right_Rear", (Spark) drive_TrainRight_Rear);
        
        drive_TrainRight_Front = new Spark(2);
        LiveWindow.addActuator("Drive_Train", "Right_Front", (Spark) drive_TrainRight_Front);
        
        drive_TrainLeft_Front = new Spark(0);
        LiveWindow.addActuator("Drive_Train", "Left_Front", (Spark) drive_TrainLeft_Front);
        
        drive_TrainLeft_Rear = new Spark(1);
        LiveWindow.addActuator("Drive_Train", "Left_Rear", (Spark) drive_TrainLeft_Rear);
        
        drive_TrainRobot_Drive = new RobotDrive(drive_TrainLeft_Front, drive_TrainLeft_Rear,
              drive_TrainRight_Front, drive_TrainRight_Rear);
        
        drive_TrainRobot_Drive.setSafetyEnabled(true);
        drive_TrainRobot_Drive.setExpiration(0.1);
        drive_TrainRobot_Drive.setSensitivity(0.5);
        drive_TrainRobot_Drive.setMaxOutput(1.0);

        elevatorElevator = new VictorSP(4);
        LiveWindow.addActuator("Elevator", "Elevator", (VictorSP) elevatorElevator);
        
        armArm = new VictorSP(5);
        LiveWindow.addActuator("Arm", "Arm", (VictorSP) armArm);
        
        pickupPickup = new Talon(6);
        LiveWindow.addActuator("Pickup", "Pickup", (Talon) pickupPickup);
        
        sensorsPowerDistributionPanel = new PowerDistributionPanel(0);
        LiveWindow.addSensor("Sensors", "PowerDistributionPanel", sensorsPowerDistributionPanel);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
