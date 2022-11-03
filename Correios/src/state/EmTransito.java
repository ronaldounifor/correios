package state;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.Remessa;

public class EmTransito extends State {

    public EmTransito(Remessa remessa) {
        this.remessa = remessa;
    }

    @Override
    public String getSituacao() {
        return "Vai chegar!";
    }

    @Override
    public void tratar() {
        //Recebido
        if(remessa.getDataRecebimento() != null)
            remessa.setEstado(new Recebido(remessa));
        //Retido
    }

    @Override
    public String preverEntrega() {
        Date envio = remessa.getDataEnvio();
        Calendar calendar = Calendar.getInstance();
        long diferenca = calendar.getTime().getTime() - envio.getTime();
        long dias = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
        return 15 - dias + " dias"; 
    }
    
}
