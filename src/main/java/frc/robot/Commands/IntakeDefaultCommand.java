// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class IntakeDefaultCommand extends CommandBase {
  /** Creates a new IntakeDefaultCommand. */
  public IntakeDefaultCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.INTAKE_SUBSYSTEM);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (Robot.OI.getLBPressed()) {
      Robot.INTAKE_SUBSYSTEM.intake(1); //Intake
    } else if (Robot.OI.getRBPressed()) {
      Robot.INTAKE_SUBSYSTEM.intake(-1); //Outtake
    } else {
      Robot.INTAKE_SUBSYSTEM.intake(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
