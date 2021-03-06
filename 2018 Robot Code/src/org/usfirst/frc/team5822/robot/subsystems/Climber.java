package org.usfirst.frc.team5822.robot.subsystems;

import org.usfirst.frc.team5822.robot.Robot;
import org.usfirst.frc.team5822.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem 
{
	VictorSP climberL, climberR;
	DoubleSolenoid release;

	public Climber()
	{
		if (Robot.isOldRobot) {
			climberL = null;
			climberR = null;
			release = null;
		} else {
			climberL = new VictorSP(RobotMap.k_climbLeft);
			
			release = new DoubleSolenoid(RobotMap.k_climberSolo1, RobotMap.k_climberSolo2);
			release.set(DoubleSolenoid.Value.kReverse);
		}
	}
	
	public void climbLeft()
	{
		System.out.println("Climber - climbLeft");
		if (Robot.isOldRobot) {return;}
		climberL.set(.75);
	}
	public void stopClimbLeft()
	{
		System.out.println("Climber - stopClimbLeft");
		if (Robot.isOldRobot) {return;}
		climberL.set(0);
	}
	public void release()
	{
		System.out.println("Climber - release");
		if (Robot.isOldRobot) {return;}
		release.set(DoubleSolenoid.Value.kForward);
	}
	
    public void initDefaultCommand() {}
}

