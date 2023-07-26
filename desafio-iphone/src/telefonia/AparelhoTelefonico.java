package telefonia;

public class AparelhoTelefonico implements Phone {

    @Override
    public void ligar() {
        System.out.println("ligando");

    }

    @Override
    public void atender() {
        System.out.println("atendendo");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("correio de voz");

    }

}