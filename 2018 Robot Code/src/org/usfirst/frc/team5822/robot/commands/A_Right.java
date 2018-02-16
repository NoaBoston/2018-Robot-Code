package org.usfirst.frc.team5822.robot.commands;

import org.usfirst.frc.team5822.robot.RobotMap;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class A_Right extends CommandGroup 
{

    public A_Right(String gameData, int side) 
    {
    	if (gameData.charAt(0) == 'R' && side == 0)
    	{
    		// Right Side Switch
    		System.out.println("Right Position/Right Switch");
    		addSequential(new DriveForward(148.875));
    		addParallel(new MoveArm(RobotMap.k_potSwitch));
    		addSequential(new TurnGroup(-90));
    		addSequential(new DriveForward(19.435));
    		addSequential(new Intake(-.7, false));
    	} 
    	else 
    	{
    		if (gameData.charAt(1) == 'R' && side == 1)
    		{
    			// Right Side Scale
    			System.out.println("Right Position/Right Scale");
    			addSequential(new DriveForward(304.875));
    			addParallel(new MoveArm(RobotMap.k_potScale));
    			addSequential(new TurnGroup(-90));
    			addSequential(new DriveForward(5.755));
    			addSequential(new Intake(-.7, false));
    		} 
    		else 
    		{
    			// Cross Baseline
    			System.out.println("Right Position/Cross Baseline");
    			addSequential(new DriveForward(148.875));
			}
		}
    }
}
