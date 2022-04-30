// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakePneumatics extends SubsystemBase {
  /** Creates a new IntakePneumatics. */
  DoubleSolenoid solenoid;
  Value state;

  public IntakePneumatics() {
    solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);

    
    state = Value.kOff;

    solenoid.set(state);
  }

  public void toggle() {
    
    state = (state == Value.kForward) ? Value.kReverse : Value.kForward;
    /*
     * if (bool) {
     * state = Value.kReverse;
     * } else {
     * state = Value.kForward;
     * }
     */ // Is the equivalent of the above ternary operator
    solenoid.set(state);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
