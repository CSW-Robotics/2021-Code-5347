/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Sub_Drivetrain extends SubsystemBase {
  //sets talon ports for left wheels and right wheels
  private final TalonSRX leftWheels = new TalonSRX(Constants.leftWheelsPort);
  private final TalonSRX rightWheels = new TalonSRX(Constants.rightWheelsPort);

  //Stops motor (sets speed for both sides to 0%)
public void stop() {
  leftWheels.set(ControlMode.PercentOutput, 0);
  rightWheels.set(ControlMode.PercentOutput, 0);
}
  //Starts motor (sets speed for both sides to 75%)
public void goForward() {
  leftWheels.set(ControlMode.PercentOutput, 0.75);
  rightWheels.set(ControlMode.PercentOutput, 0.75);
}
  //makes the left wheels turn backwards, makes the right wheels turn forwards
public void turnLeft(){
  leftWheels.set(ControlMode.PercentOutput, -0.75);
  rightWheels.set(ControlMode.PercentOutput, 0.75);
}
  //makes the left wheels turn forwards, makes the right wheels turn backwards
public void turnRight(){
  leftWheels.set(ControlMode.PercentOutput, 0.75);
  rightWheels.set(ControlMode.PercentOutput, -0.75);
}
  //makes all wheels turn backwards
public void goBackwards(){
  leftWheels.set(ControlMode.PercentOutput, -0.75);
  rightWheels.set(ControlMode.PercentOutput, -0.75);
}

  public Sub_Shooter() {

  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
