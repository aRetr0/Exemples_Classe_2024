package Adapter_Motor;

public class MotorGasoil implements IMotor {

    public MotorGasoil() {
        super();
    }

    public String encendre() {
        return ("Encenent el motor de gasoil");
    }

    public String accelerar() {
        return ("Accelerant el motor de gasoil");
    }

    public String apagar() {
        return ("Apagant el motor de gasoil");
    }
}