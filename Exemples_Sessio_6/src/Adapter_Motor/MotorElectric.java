package Adapter_Motor;

public class MotorElectric {

    private boolean conectat = false;

    public MotorElectric() {
        this.conectat = false;
    }

    public String connectar() {
        this.conectat = true;
        return ("Connectant el motor el�ctric");
    }

    public String activar() throws Exception {
        if (!this.conectat) {
            throw new Exception("No es pot activar el motor el�ctric: motor no connectat");
        } else {
            return ("Activant el motor el�ctri");
        }
    }

    public String moureMesRapid() throws Exception {
        if (!this.conectat) {
            throw new Exception("No es pot augmentar el voltatge del motor el�ctric: motor no connectat");
        } else {
            return ("Augmentant el voltatge del motor el�ctric");
        }
    }

    public String aturar() throws Exception {
        if (!this.conectat) {
            throw new Exception("No es pot parar el motor el�ctric: motor no connectat");
        } else {
            return ("Parant el motor el�ctric");
        }
    }

    public String desconnectar() {
        this.conectat = false;
        return ("Desconnectant el motor el�ctric");
    }
}