package state;

import model.Remessa;

public class Postado extends State {

    public Postado(Remessa remessa) {
        this.remessa = remessa;
    }

    @Override
    public String getSituacao() {
        return "Remessa "+remessa.getProtocolo()+" foi postada no centro de distribuição";
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
