package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.spikes2212.command.genericsubsystem.MotoredGenericSubsystem;
import com.spikes2212.control.PIDSettings;
import com.spikes2212.util.TalonEncoder;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class Shooter extends MotoredGenericSubsystem {
    private WPI_TalonSRX one;
    private WPI_TalonSRX two;
    private PIDSettings kp, ki,kd;

private TalonEncoder talonEncoder;
    public Shooter(WPI_TalonSRX one, WPI_TalonSRX two) {

        super("namespaceName", one, two);
        this.one = one;
        this.two = two;
        this.talonEncoder = new TalonEncoder(two);
        this.one.setInverted(true);
        this.two.setInverted(true);
        talonEncoder.setDistancePerPulse((double)1/4096*42/24*1.3);

    }
    public double GetSpeed(){
        return talonEncoder.getVelocity() * 10;
    }



}
