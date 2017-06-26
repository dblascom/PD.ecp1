package es.upm.miw.pd.state.connection;

public class StateParado extends State {

private Estado estado;
    
    public StateParado(){
        this.estado = Estado.PARADO;
    }
    
    @Override
    public Estado getEstado(){
        return estado;
    }

    @Override
    public void abrir(Context context) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cerrar(Context context) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void iniciar(Context context) {
        context.setState(new StatePreparado());
    }

    @Override
    public void parar(Context context) {
    }

    @Override
    public void enviar(Context context, String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void recibir(Context context, int value) {
        throw new UnsupportedOperationException();
    }

}
