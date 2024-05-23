package Adapter_Motor;

public interface IMotor {

    String encendre() throws Exception;

    String accelerar() throws Exception;

    String apagar() throws Exception;
}
