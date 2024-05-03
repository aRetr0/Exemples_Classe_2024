package Adapter_Motor;

public class MotorElectric {

    private boolean conectat = false;

    public MotorElectric() {
        this.conectat = false;
    }

    public String connectar() {
    	this.conectat = true;
        return("Connectant el motor elèctric");        
    }

    public String activar() throws Exception {
        if (!this.conectat) {
        	 throw new Exception("No es pot activar el motor elèctric: motor no connectat");
        } else {
            return("Activant el motor elèctri");
        }
    }

    public String moureMesRapid() throws Exception {
        if (!this.conectat) {
            throw new Exception("No es pot augmentar el voltatge del motor elèctric: motor no connectat");
        } else {
            return("Augmentant el voltatge del motor elèctric");
        }
    }

    public String aturar() throws Exception {
        if (!this.conectat) {
        	 throw new Exception("No es pot parar el motor elèctric: motor no connectat");
        } else {
           return("Parant el motor elèctric");
        }
    }

    public String desconnectar() {
    	this.conectat = false;
    	return("Desconnectant el motor elèctric");
    }        
}