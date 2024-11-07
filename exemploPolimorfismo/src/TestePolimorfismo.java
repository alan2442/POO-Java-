public class TestePolimorfismo {
    public static void main(String args[]) {
        Bicho b;

        String[] array = {"cachorro"};

        if (array[0].equals("cachorro")) {
            b = new Cachorro();
        } else {
            b = new Gato();
        }

        b.fala();
    }
}
