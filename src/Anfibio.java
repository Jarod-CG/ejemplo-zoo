public class Anfibio extends Animal {
    private String color;
    private boolean nadar;

    public Anfibio  (String nombre, int edad, String color, boolean nadar){
        super(nombre, edad);
        this.color = color;
        this.nadar = nadar;
    }

    public String getColor (){
        return this.color;
    }

    public boolean getNadar(){
        return this.nadar;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setNadar (boolean nadar){
        this.nadar = nadar;
    }

    public void moverse (){
        System.out.println(this.nombre + " se mueve saltando");
    }

    public void comer() {
        System.out.println(super.nombre + " come como anfibio");
        this.comio = true;
    }

    public void dormir (){
        System.out.println(super.getNombre() + " duerme como anfibio");
    }

}
