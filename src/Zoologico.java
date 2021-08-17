import java.util.ArrayList;
//se importa por el ArrayList que usamos

//lo ideal es poner todos los atributos juntos
//luego constructores, (tienen el nombre de la clase)
//luegos los getters y setters
//y el resto de metodos

//aquí creé 4 constructores, no siempre se necesitan todos
//pero ustedes crean los que necesiten, nada más

//los atributos "normalmente" se ponen privados
//y se acceden(get) a ellos y se asignan(set) 
//por medio de getters y setters
//esto para proteger el codigo
//o validar las asignaciones

public class Zoologico {
    //atributos
    private ArrayList<Animal> animales;
    //es un arraylis de animal, por eso entre parentesis angulares
    //animales puede contener : Animal, Ave o Anfibio
    //porque Ave y Anfibio son tambien de tipo Animal 
    private String nombre;

    //************************************
    //contructores
    //no retornan nada solo requieren el modificador de acceso
    public Zoologico (){
        //this se refiere a esta clase
        //si ponen this. veran que les muestra
        //los atributos de ESTA clase y sus metodos
        this.animales  = new ArrayList<Animal>();
    }

    public Zoologico (String nombre){
        this.nombre = nombre;
        this.animales  = new ArrayList<Animal>();
    }

    public Zoologico (ArrayList<Animal> animales){
        this.animales = animales;
    }

    public Zoologico (ArrayList<Animal> animales, String nombre){
        this.animales = animales;
        this.nombre = nombre;
    }

    //**************************************
    //getters
    public String getNombre (){
        return this.nombre;
    }

    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }

    //**************************************
    //setters
    //en este valido que tipo de string se asigna a nombre
    public void setNombre (String nombre_){
        if (nombre_.length() > 8 ){
            nombre = nombre_;
        }    
    }

    public void setAnimales (ArrayList<Animal> animales){
        this.animales = animales;
    }

    //**************************************
    //resto de metodos
    public void alimentarAnimales (){
        //for (inicializa iterador ; condición ; modifica iterdador){
        //      instrucción
        //}
        for (int i = 0; i < animales.size();i++){
            animales.get(i).comer();
        }
    }

    //agrega un animal al arraylis
    //el arraylist debe instanciarse (con new)
    public void addAnimales (Animal animal){
        //add es un metodo de ArrayList
        animales.add(animal);
    }

    public void verAnimales (){
        for(int i = 0; i < animales.size(); i++){
            System.out.println(animales.get(i).getNombre());
        }
    }

}
