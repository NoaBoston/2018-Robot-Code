
package org.usfirst.frc.team5822.robot.commands;

import org.usfirst.frc.team5822.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class SolenoidReverse extends Command 
{

    public SolenoidReverse() 
    {
        requires(Robot.intakeArm);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    		Robot.intakeArm.reverse();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    		Robot.intakeArm.off();
    	}

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    }
}