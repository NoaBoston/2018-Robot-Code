package org.usfirst.frc.team5822.robot;

import org.usfirst.frc.team5822.robot.commands.Testing;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI 
{
	Joystick joy1, joy2;
	
	public OI(Joystick j, Joystick k)
	{
		joy1 = j;
		joy2 = k;
		
		
		Button j7 = new JoystickButton(j, 7);
		Button j8 = new JoystickButton(j, 8); 
		//9 and 10 don't work on our joystick 
		Button j11 = new JoystickButton(j, 11); 
		Button j12 = new JoystickButton(j, 12);

		Button buttonA = new JoystickButton(k, 1);
		Button buttonB = new JoystickButton(k, 2);
		Button buttonX = new JoystickButton(k, 3);
		Button buttonY = new JoystickButton(k, 4);
		Button buttonLB = new JoystickButton(k, 5);
		Button buttonRB = new JoystickButton(k, 6);
		Button buttonBack = new JoystickButton(k, 7);
		Button buttonStart = new JoystickButton(k, 8);
		
		
		buttonA.whenPressed(new Testing());
		
		
		
	}

	
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
