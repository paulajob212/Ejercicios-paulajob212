public class FechaNacimiento {

    private int anio;
    private int mes;
    private int dia;

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "FechaNacimiento{" +
                "anio=" + anio +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }
}
