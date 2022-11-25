public class ArmaCorta extends Arma{
    private boolean esAutomatica;

    public ArmaCorta(int alcance, String marca, double calibre, String estado, Policia policia, boolean esAutomatica) {
        super(alcance, marca, calibre, estado, policia);
        this.esAutomatica = esAutomatica;
    }

    public boolean puedeDispararAMasDe200Metros(){
        if(this.alcance>=200){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}
