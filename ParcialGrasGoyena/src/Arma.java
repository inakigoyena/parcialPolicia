public abstract class Arma {
    protected int alcance;
    protected String marca;
    protected double calibre;
    protected String estado;
    protected Policia policia;

    public Arma(int alcance, String marca, double calibre, String estado, Policia policia) {
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }

    public boolean aptaParaUsoPolicial() {
        if (this.estado == "EN USO" && this.calibre >= 9){
            return true;
        }else{
            return false;
        }
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }
}