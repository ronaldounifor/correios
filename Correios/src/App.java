import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import model.Pessoa;
import model.Remessa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa remetente = new Pessoa("Rua Felicidade 10", "João Felício", 88);
        Pessoa destinatario = new Pessoa("Rua Alegria 25", "Maria Felícia", 66);
        
        Remessa remessa = new Remessa(1, 20, 20, 20, remetente, destinatario);
        
        remessa.adicionar(destinatario);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -8);
        //TODO checar nova API: LocalDate 
        remessa.setDataEnvio(calendar.getTime());

        remessa.setDataRecebimento(new Date());


    }
}
