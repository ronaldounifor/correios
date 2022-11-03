package state;

import model.Remessa;

public abstract class State {
    protected Remessa remessa;

    public abstract String getSituacao();
    public abstract String preverEntrega();
    public abstract void tratar();
}
