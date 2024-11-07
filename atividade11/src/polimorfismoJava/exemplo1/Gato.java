package polimorfismoJava.exemplo1;


//Classe herdando da classe Bicho
public class Gato extends Bicho {
    
    //Usando polimorfismo de sobrescrita de método
    //Método fala
    public void fala() {
        System.out.println("Miau");
    }
}
