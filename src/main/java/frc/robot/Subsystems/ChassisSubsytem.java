// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ChassisSubsytem extends SubsystemBase {
  /** Creates a new ChassisSubsytem. */
  DifferentialDrive drive;

  public ChassisSubsytem() {
    int[] channels = {10, 20, 11, 21, 12, 22};

    WPI_VictorSPX leftLead = new WPI_VictorSPX(channels[0]);
    WPI_VictorSPX rightLead = new WPI_VictorSPX(channels[1]);

    WPI_VictorSPX leftFollow1 = new WPI_VictorSPX(channels[2]);
    WPI_VictorSPX rightFollow1 = new WPI_VictorSPX(channels[3]);

    WPI_VictorSPX leftFollow2 = new WPI_VictorSPX(channels[4]);
    WPI_VictorSPX rightFollow2 = new WPI_VictorSPX(channels[5]);

    leftFollow1.follow(leftLead);
    leftFollow2.follow(leftLead);

    rightFollow1.follow(rightLead);
    rightFollow2.follow(rightLead);

    MotorControllerGroup left = new MotorControllerGroup(leftLead, leftFollow1, leftFollow2);
    MotorControllerGroup right = new MotorControllerGroup(rightLead, rightFollow1, rightFollow2);

    drive = new DifferentialDrive(left, right);
  }

  public void move(double rotation, double speed) {
    drive.arcadeDrive(rotation, speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
