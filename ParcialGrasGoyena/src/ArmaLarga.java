public class ArmaLarga extends Arma implements Comparable <ArmaLarga>{

    private boolean tieneSelloRenar;
    private String justificacionDeUso;
    private int nivelDeArma;

    public ArmaLarga(int alcance, String marca, double calibre, String estado, Policia policia, boolean tieneSelloRenar, String justificacionDeUso, int nivelDeArma) {
        super(alcance, marca, calibre, estado, policia);
        this.tieneSelloRenar = tieneSelloRenar;
        this.justificacionDeUso = justificacionDeUso;
        this.nivelDeArma = nivelDeArma;
    }


    @Override
    public int compareTo(ArmaLarga armaLarga) {
        if(this.nivelDeArma > armaLarga.getNivelDeArma()){
            return 1;
        } else if (this.nivelDeArma < armaLarga.getNivelDeArma()){
            return -1;
        }else{
            return 0;
        }
    }

    public boolean isTieneSelloRenar() {
        return tieneSelloRenar;
    }

    public void setTieneSelloRenar(boolean tieneSelloRenar) {
        this.tieneSelloRenar = tieneSelloRenar;
    }

    public String getJustificacionDeUso() {
        return justificacionDeUso;
    }

    public void setJustificacionDeUso(String justificacionDeUso) {
        this.justificacionDeUso = justificacionDeUso;
    }

    public int getNivelDeArma() {
        return nivelDeArma;
    }

    public void setNivelDeArma(int nivelDeArma) {
        this.nivelDeArma = nivelDeArma;
    }
}
