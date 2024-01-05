public class Videojuegos {
    String descripcion;

    public Videojuegos(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void imprimir(){
        System.out.println("Descripcion: "+this.getDescripcion());
    }
}
