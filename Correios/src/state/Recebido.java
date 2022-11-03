package state;

import model.Remessa;

public class Recebido extends State {

    public Recebido(Remessa remessa) {
        this.remessa = remessa;
    }

    @Override
    public String getSituacao() {
        
        return null;
    }

    @Override
    public void tratar() {
        
    }

    @Override
    public String preverEntrega() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
