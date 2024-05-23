package Adapter_Motor;

public class MotorGasolina implements IMotor {

    public MotorGasolina() {
        super();
    }

    public String encendre() {
        return ("Encenent el motor de gasolina");
    }

    public String accelerar() {
        return ("Accelerant el motor de gasolina");
    }

    public String apagar() {
        return ("Apagant el motor de gasolina");
    }
}