package classes;


public class Ufesp {
    
    private int ano;
    private int mes;
    private double valor;
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void valorUfesp() {
        //UFESP ANUAL
        switch (this.getAno()){
            case 1997:
                this.setValor(7.93f);                
                break;
            case 1998:
                this.setValor(8.37f);                
                break;
            case 1999:
                this.setValor(8.51f);
                break;
            case 2000:
                this.setValor(9.27f);
                break;
        }
        //UFESP SEMESTRAL
        if (this.getAno() == 1996 && this.getMes() >=1 && this.getMes() <=6){
            this.setValor(7.21f);                   
        }else if(this.getAno() == 1996 && this.getMes() >= 7 && this.getMes() <=12){
            this.setValor(7.70f);       
        }
        //UFESP TRIMESTRAL    
        if (this.getAno() == 1995 && this.getMes() >=1 && this.getMes() <=3){
            this.setValor(5.89f);
        }else if(this.getAno() == 1995 && this.getMes() >=4 && this.getMes() <=6){
            this.setValor(6.14f);
        }else if(this.getAno() == 1995 && this.getMes() >=7 && this.getMes() <=9){
            this.setValor(6.58f);
        }else if(this.getAno() == 1995 && this.getMes() >=10 && this.getMes() <=12){
            this.setValor(6.92f);
        }
        //UFESP MENSAL
        if (this.getAno() == 1994 && this.getMes() == 7){
            this.setValor(5.01f);            
        }else if(this.getAno() == 1994 && this.getMes() == 8){
            this.setValor(5.19f);
        }else if(this.getAno() == 1994 && this.getMes() == 9){
            this.setValor(5.40f);
        }else if(this.getAno() == 1994 && this.getMes() == 10){
            this.setValor(5.49f);            
        }else if(this.getAno() == 1994 && this.getMes() == 11){
            this.setValor(5.59f);
        }else if(this.getAno() == 1994 && this.getMes() == 12){
            this.setValor(5.76f);
        }else if(this.getAno() == 1994 && this.getMes() >= 1 && this.getMes() <=6){
            this.setValor(0);
        }   
    }  
    
}
