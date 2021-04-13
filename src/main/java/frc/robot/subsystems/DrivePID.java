package frc.robot.subsystems;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;

public class DrivePID extends PIDSubsystem {

    public DrivePID(PIDController controller) {
        super(controller);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void useOutput(double output, double setpoint) {
        // TODO Auto-generated method stub

    }

    @Override
    protected double getMeasurement() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
