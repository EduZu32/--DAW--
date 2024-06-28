package model;

public enum Puesto {
    mando("este puesto manda sobre todo el mundo",1000),
    gerencia("Este puesto se encarga de controlar", 5000),
    direccion("Este puesto controla la empresa",15000);

    private String descripcion;
    private int salarioAdicional;

    Puesto(String descripcion, int salarioAdicional) {
        this.descripcion = descripcion;
        this.salarioAdicional = salarioAdicional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSalarioAdicional() {
        return salarioAdicional;
    }

    public void setSalarioAdicional(int salarioAdicional) {
        this.salarioAdicional = salarioAdicional;
    }
}
