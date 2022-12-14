package state;

import model.Remessa;

public class Postado extends State {

    public Postado(Remessa remessa) {
        this.remessa = remessa;
        this.remessa.notificar();
    }

    @Override
    public String getSituacao() {
        return "Postado";
    }

    @Override
    public void tratar() {
        if(remessa.getDataEnvio() != null)
            remessa.setEstado(new EmTransito(remessa));
    }

    @Override
    public String preverEntrega() {
        return "15 dias";
    }
    
}
