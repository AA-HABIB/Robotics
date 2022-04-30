// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class LimelightFollowCommand extends CommandBase {
  /** Creates a new LimelightFollowCommand. */
  public LimelightFollowCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.CHASSIS_SUBSYTEM);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rotationSpeedControl = 0.04;
    final double minimumSpeed = 0.003;
    double horizontalOffset = Robot.LIMELIGHT.getTX();
    boolean validTarget = Robot.LIMELIGHT.getValidTarget();
    double distance = Robot.LIMELIGHT.getDistance();
    double adjust = 0d;

    if (!validTarget) {
      Robot.CHASSIS_SUBSYTEM.spin(0.4);
    } else {
      if (horizontalOffset > 1) {
        adjust = rotationSpeedControl * horizontalOffset - minimumSpeed;
      } else if (horizontalOffset < 1) {
        adjust = rotationSpeedControl * horizontalOffset + minimumSpeed;
      }

      if (distance < 190) {// drives backward
        if (distance > 170) {
          Robot.CHASSIS_SUBSYTEM.move(0.2, adjust);
        } else {
          Robot.CHASSIS_SUBSYTEM.move(0.5, adjust);
        }
      } else if (distance > 210) {
        if (distance < 230) {
          Robot.CHASSIS_SUBSYTEM.move(-0.2, adjust);
        } else {
          Robot.CHASSIS_SUBSYTEM.move(-0.5, adjust);
        }
      } else if (distance <= 100 || distance >= 210) {
        Robot.SHOOTER_SUBSYSTEM.shoot(1);
      } else {
        Robot.SHOOTER_SUBSYSTEM.shoot(0);
        Robot.CHASSIS_SUBSYTEM.spin(adjust);
      }
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
