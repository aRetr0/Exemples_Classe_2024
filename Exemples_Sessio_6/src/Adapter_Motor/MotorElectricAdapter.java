package Adapter_Motor;

public class MotorElectricAdapter implements IMotor {

    private final MotorElectric motor;

    public MotorElectricAdapter() {this.motor = new MotorElectric();}

    @Override
    public String encendre() throws Exception {
        return this.motor.connectar() + this.motor.activar();
    }

    @Override
    public String accelerar() throws Exception {
        return this.motor.moureMesRapid();
    }

    @Override
    public String apagar() throws Exception {
        return this.motor.aturar() + this.motor.desconnectar();
    }
}
