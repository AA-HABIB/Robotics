// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class MagazineDefaultCommand extends CommandBase {
  /** Creates a new MagazineDefaultCommand. */
  public MagazineDefaultCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.MAGAZINE_SUBSYSTEM);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (Robot.OI.getXPressed()) {
      Robot.MAGAZINE_SUBSYSTEM.set(1);
    } else if (Robot.OI.getYPressed()) {
      Robot.MAGAZINE_SUBSYSTEM.set(-1);
    } else {
      Robot.MAGAZINE_SUBSYSTEM.set(0);
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
