package classes;


public class ValorVenal extends Ufesp {
    
    private double venal;
    private double venalatual;

    public double getVenal() {
        return venal;
    }

    public void setVenal(double venal) {
        this.venal = venal;
    }

    public double getVenalatual() {
        return venalatual;
    }

    public void setVenalatual(double venalatual) {
        this.venalatual = venalatual;
    }    
    
    public void calcMeação() {        
        this.venalatual/=2;
    }
}
