package es.upm.miw.pd.state.connection;

public class StatePreparado extends State {

    private Estado estado;
    
    public StatePreparado(){
        this.estado = Estado.PREPARADO;
    }
    
    @Override
    public Estado getEstado(){
        return estado;
    }
    
    @Override
    public String toString(){
        return "Estado preparado";
    }
    
    @Override
    public void abrir(Context context) {
    }

    @Override
    public void cerrar(Context context) {
        context.setState(new StateCerrado());
    }

    @Override
    public void iniciar(Context context) {
        
    }

    @Override
    public void parar(Context context) {
        context.setState(new StateParado());
    }

    @Override
    public void enviar(Context context, String msg) {
        context.setState(new StateEsperando(msg));
    }

    @Override
    public void recibir(Context context, int value) {
        throw new UnsupportedOperationException();
    }

}

