package trabajopráctico;

public class Pronostico {
    
    private int codigoPartido;
    private Equipo equipo;
    private ResultadoEnum resultado;


    public Pronostico(int codigoPartido, Equipo equipo, int codigo) {
        this.codigoPartido = codigoPartido;
        this.equipo = equipo;
        this.resultado = new ResultadoEnum(codigo);
    }

    public int Puntos(Partido partido) {
        if(partido.Resultado(equipo).getCodigo() == this.resultado.getCodigo()) {
            return 2;
        }
        return 0;
    }

    public int getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(int codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }
    
}