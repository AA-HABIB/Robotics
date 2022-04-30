// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MagazineSubsystem extends SubsystemBase {
  /** Creates a new MagazineSubsystem. */
  WPI_VictorSPX magazine;
  
  public MagazineSubsystem() {
    magazine = new WPI_VictorSPX(40);
  }

  public void set(double speed){
    magazine.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
