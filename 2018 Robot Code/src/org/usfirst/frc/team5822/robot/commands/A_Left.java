package org.usfirst.frc.team5822.robot.commands;

import org.usfirst.frc.team5822.robot.RobotMap;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class A_Left extends CommandGroup
{
    public A_Left(String gameData, int goal) 
    {
    	if (gameData.charAt(0) == 'L' && gameData.charAt(1) != 'L')
    	{
    		// Left Side Switch	
    		System.out.println("Left Position/Left Switch");
    		addSequential(new DriveForward(148.875));
    		addSequential(new MoveArmPID(RobotMap.k_potSwitch));
    		addSequential(new Turn(90, -.4, false));
    		addSequential(new DriveForward(19.435));
    		addSequential(new MoveIntakeAuto(-.7));
    		addSequential(new LowerArm());
    	} 
    	else if (gameData.charAt(0) != 'L' && gameData.charAt(1) == 'L')
    	{
    		// Left Side Scale
    		System.out.println("Left Position/Left Scale");
			addSequential(new DriveForward(304.875));
			addSequential(new MoveArmScale(RobotMap.k_potScale));
			addSequential(new Turn(90, -.4, false));
			addSequential(new DriveForward(5.755)); 
    		addSequential(new MoveIntakeAuto(-.7));
    		addSequential(new LowerArm());
    		addSequential(new LowerArm());
    		addSequential(new LowerArm());
    	}
    	else if (gameData.charAt(0) == 'L' && gameData.charAt(1) == 'L')
    	{
    		if (goal == 0)
    		{
    			// Left Side Switch	
    			System.out.println("Left Position/Left Switch");
        		addSequential(new DriveForward(140));
        		addSequential(new MoveArmPID(RobotMap.k_potSwitch));
        		addSequential(new Turn(90, -.4, false));
        		//addSequential(new DriveForward(5));
        		addSequential(new MoveIntakeAuto(-.7));
        		addSequential(new LowerArm());
    		}
    		else if (goal == 1)
    		{
    			// Left Side Scale
    			System.out.println("Left Position/Left Scale");
    			addSequential(new DriveForward(304.875));
    			addSequential(new MoveArmScale(RobotMap.k_potScale));
    			addSequential(new Turn(90, -.4, false));
    			addSequential(new DriveForward(5.755)); 
        		addSequential(new MoveIntakeAuto(-.7));
        		addSequential(new LowerArm());
        		addSequential(new LowerArm());
        		addSequential(new LowerArm());
    		}
    	}
    	else 
    	{
    		// Cross Baseline
    		System.out.println("Left Position/Cross Baseline");
    		addSequential(new DriveForward(148.875));
    	}
    }
}
