
package trabajopráctico;

public class ResultadoEnum {
	
    private int codigo;
    private String descripcion;

    public ResultadoEnum (int codigo ) {
        this.codigo = codigo;
        if(codigo == 0)
            this.descripcion = "Ganador";
        if(codigo == 1)
            this.descripcion = "Perdedor";
        else
            this.descripcion = "Empate";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}