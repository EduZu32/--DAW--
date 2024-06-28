package model;

public class Deportivo extends Vehiculo{

    //Tengo todo lo que tiene vehiculo utilizando el modelo Vehiculo como padre con la palabra reservada extends y
    // lo puedo utilizar sin problema
    //en el caso de querer utilizar un constructor lo tengo que llamar explicitamente

    private int par;
    //Constructor vacio
    public Deportivo(){}



    //Constructor deportivo
    public Deportivo(int bastidor,String marca, String modelo,int cc, int cv, int par){
        //this.bastidor = bastidor
        //palabra reservada SUPER que coje los datos del constructor vehiculo
        super(bastidor,marca,modelo,cc,cv);
        this.par = par;
    }

    //Sobre escribir un metodo con el @override que indican por donde tienen que ir para conseguir los datos
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Par " +par);
    }
    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+20);
    }


    public void activarModoSport(){
        System.out.println("Activando el modo SPORT");
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
