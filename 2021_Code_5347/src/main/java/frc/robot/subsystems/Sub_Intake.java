/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Sub_Intake extends SubsystemBase {
  private final TalonSRX intakeMotor = new TalonSRX(Constants.intakeMotorPort);
  /**
   * Creates a new Sub_Intake.
   */
  public Sub_Intake() {

  }
public void spin() {
  intakeMotor.set(ControlMode.PercentOutput, .3);
}


public void stop() {
  intakeMotor.set(ControlMode.PercentOutput, 0);
}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
