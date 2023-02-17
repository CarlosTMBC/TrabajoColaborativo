
package Modelo;

public class EquipoR {
    String Marca;
    String Modelo;
    String TipoPc;
    String Problema;

    public EquipoR(String Marca, String Modelo, String TipoPc, String Problema) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.TipoPc = TipoPc;
        this.Problema = Problema;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipoPc() {
        return TipoPc;
    }

    public void setTipoPc(String TipoPc) {
        this.TipoPc = TipoPc;
    }

    public String getProblema() {
        return Problema;
    }

    public void setProblema(String Problema) {
        this.Problema = Problema;
    }
    
    
}
