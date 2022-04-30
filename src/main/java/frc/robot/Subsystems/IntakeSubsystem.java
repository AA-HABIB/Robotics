
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */
  WPI_VictorSPX intakeMotor;

  public IntakeSubsystem() {
    intakeMotor = new WPI_VictorSPX(30);
  }

  public void intake(double speed){
    intakeMotor.set(speed);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}