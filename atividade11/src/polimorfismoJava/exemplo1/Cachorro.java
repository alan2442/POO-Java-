package polimorfismoJava.exemplo1;


//Classe herdando da classe Bicho
public class Cachorro extends Bicho{
    
    //Usando polimorfismo de sobrescrita de método
    //Método fala
    public void fala() {
        System.out.println("Au Au");
    }
}
