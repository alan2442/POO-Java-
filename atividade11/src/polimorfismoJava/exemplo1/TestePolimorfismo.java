package polimorfismoJava.exemplo1;




public class TestePolimorfismo {
    
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Por favor, forneça um argumento: 'cachorro' ou 'gato'.");
            return;
        }

        Bicho b;

        if(args[0].equalsIgnoreCase("cachorro")) {
            b = new Cachorro();
        }

        else {
            b = new Gato();
        }


        b.fala();
    }
}
