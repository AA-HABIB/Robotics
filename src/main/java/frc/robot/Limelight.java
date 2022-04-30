// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Limelight {
    // Change the following constants to actual retroreflective tape heights
    final double LIMELIGHT_MOUNT_A = 16.258;
    final double LIMELIGHT_LENS_H = 82;

    final double GOAL_HEIGHT = 264.16; //Actual goal height is 264.16, but keep it at human height for time being

    NetworkTable nTable;
    
    
    public Limelight(){
        nTable = NetworkTableInstance.getDefault().getTable("limelight");
    }

    // Returns the horizontal offset from crosshair to target
    public double getTX(){
        NetworkTableEntry tx = nTable.getEntry("tx");
        return tx.getDouble(0.0);
    }

    // Returns the vertical offset from crosshair to target
    public double getTY(){
        NetworkTableEntry ty = nTable.getEntry("ty");
        return ty.getDouble(0.0);
    }

    // Returns the percentage of screen that the target fills
    public double getTA(){
        NetworkTableEntry ta = nTable.getEntry("ta");
        return ta.getDouble(0.0);
    }

    public boolean getValidTarget(){
        return !(this.getTX() == 0 && this.getTY() == 0);
    }

}
