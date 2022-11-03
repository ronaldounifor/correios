import java.util.Date;

import model.Pessoa;
import model.Remessa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa remetente = new Pessoa("Rua Felicidade 10", "João Felício", 88);
        Pessoa destinatario = new Pessoa("Rua Alegria 25", "Maria Felícia", 66);
        Remessa remessa = new Remessa(1, 20, 20, 20, remetente, destinatario);
        
        System.out.println(remessa.getSituacao());
        System.out.println(remessa.preverEntrega());

        remessa.setDataEnvio(new Date(new Date().getTime() - 8*24*60*60*1000));

        System.out.println(remessa.getSituacao());
        System.out.println(remessa.preverEntrega());

        remessa.setDataRecebimento(new Date());

        System.out.println(remessa.getSituacao());
        System.out.println(remessa.preverEntrega());
    }
}
