public final class TareaTrabajoPrimaria extends TareaTrabajo {
    private int rendimineto;

    public TareaTrabajoPrimaria() {
    }

    public TareaTrabajoPrimaria(String titulo, String descripcion, boolean completada, int presupuesto, int rendimineto) {
        super(titulo, descripcion, completada, presupuesto);
        this.rendimineto = rendimineto;
    }

    public void metodoTareaPrimaria(){
        System.out.println("Ejecutado desde primaria");
    }
}
