package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.Commands.LimelightFollowCommand;

public class OperatorInput {
    public XboxController controller1;
    public XboxController controller2;

    Button limeButton;


    public OperatorInput(){
        controller1 = new XboxController(0);
        controller2 = new XboxController(1);
    }

    public boolean getCont1A(){
        return controller1.getAButtonPressed();
    }

    public boolean getCont1B(){
        return controller1.getBButton();
    }

    public double getSpeed(){
        return -controller1.getLeftY();
    }
    public double getRotation(){
        return controller1.getRightX();
    }
    public boolean getBPressed(){ //shooter
        return controller2.getBButton();
    }
    
    public boolean getLBPressed(){ 
        return controller2.getLeftBumper();
    }

    public boolean getRBPressed(){
        return controller2.getRightBumper();
    }

    public boolean getXPressed(){
        return controller2.getXButton();
    }
    public boolean getYPressed(){
        return controller2.getYButton();
    }
}