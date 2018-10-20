package org.usfirst.frc.team5678.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.*;

import org.usfirst.frc.team5678.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private Spark Left = new Spark(0);
	private Spark Right = new Spark(1);
	private DifferentialDrive drive = new DifferentialDrive(Left,Right);
	public void drive(double y, double x) {
		drive.arcadeDrive(y, x);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
      setDefaultCommand(new DriveCommand());
    }
}

