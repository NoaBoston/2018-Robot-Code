package org.usfirst.frc.team5822.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5822.robot.commands.Intake;
import org.usfirst.frc.team5822.robot.commands.UsingBasedOnFMS;
//import org.usfirst.frc.team5822.robot.commands.*;
import org.usfirst.frc.team5822.robot.subsystems.*;

public class Robot extends TimedRobot 
{
	public static OI oi;
	//hi
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	public static Drivetrain driveTrain;
	public static Climber climber;
	public static TwoSpinnyWheels intake;
	public static Lifter arm;
	public static Sensors sensors;
	public static UsingBasedOnFMS autoMode;
	
	public static Joystick j = new Joystick(RobotMap.k_joystick1);
	public String fieldDataIMP;
	
	@Override
	public void robotInit() 
	{
		driveTrain = new Drivetrain();
		climber = new Climber();
		arm = new Lifter();
		sensors = new Sensors();
		intake = new TwoSpinnyWheels();
		
		oi = new OI();
		
		//m_chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", m_chooser);
	}

	@Override
	public void disabledInit() 
	{
		
	}                                 

	@Override
	public void disabledPeriodic() 
	{
		//Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() 
	{
		m_autonomousCommand = m_chooser.getSelected();

		if (m_autonomousCommand != null) 
		{
			m_autonomousCommand.start();
		}
		
		fieldDataIMP = DriverStation.getInstance().getGameSpecificMessage(); //GETTING THE FMS DATA
	}

	@Override
	public void autonomousPeriodic() 
	{
		Scheduler.getInstance().run();
		int position = 0;
		autoMode = new UsingBasedOnFMS(fieldDataIMP, position);
	}

	@Override
	public void teleopInit() 
	{
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
			
		}
	}

	@Override
	public void teleopPeriodic() 
	{
		Scheduler.getInstance().run();
		driveTrain.cheesyDrive(j);
	}

	@Override
	public void testPeriodic() 
	{
		
	}
}
