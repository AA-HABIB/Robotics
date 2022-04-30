// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  CANSparkMax shooter;
  // Encoder encoder;

  public ShooterSubsystem() {
    shooter = new CANSparkMax(50, MotorType.kBrushless);
    shooter.setInverted(true);

    // encoder = new Encoder(shooter shooter);
  }

  public void shoot(double speed) {
    shooter.set(speed);
  }
  
  // public double 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
