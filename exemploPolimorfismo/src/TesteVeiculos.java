public class TesteVeiculos {
    public static void main(String[] args) {
        InterfaceVeiculo meuCarro = new Carro();
        InterfaceVeiculo minhaMoto = new Moto();


        meuCarro.acelerar();
        minhaMoto.acelerar();
    }
}
