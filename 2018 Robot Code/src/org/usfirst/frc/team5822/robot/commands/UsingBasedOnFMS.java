package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class UsingBasedOnFMS extends CommandGroup 
{
	public static Left left;
	public static Right right;
	public static Center center;
    public UsingBasedOnFMS(String gameData, int fieldPosition) 
    {
    	final int leftSide = 0;
    	final int centerSide = 1;
    	final int rightSide = 2;
    	
    	switch (fieldPosition)
    	{
    	case leftSide:
    		left = new Left(gameData);
    	case centerSide:
    		center = new Center(gameData);
    	case rightSide:
    		right = new Right(gameData);
    		
    	}
    		
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
