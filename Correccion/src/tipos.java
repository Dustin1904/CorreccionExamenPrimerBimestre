public class tipos extends Genero{
    String ejemplo;

    public tipos(String descripcion, String ejemplo) {
        super(descripcion);
        this.ejemplo=ejemplo;
    }

    public String getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }

    @Override
    public void imprimir(){
        System.out.println( "Aventura: "+this.getDescripcion());
        System.out.println("Ejemplo: "+this.getEjemplo());
    }

}
