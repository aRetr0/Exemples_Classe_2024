package Adapter_Motor;

public interface IMotor {

    public String encendre() throws Exception;

    public String accelerar() throws Exception;

    public abstract String apagar()  throws Exception;
}
