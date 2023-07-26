package aparelho;

import internet.Internet;
import musica.Ipod;
import telefonia.Phone;
import musica.ReprodutorMusical;

public class Iphone implements Ipod, Phone, Internet {
    public static void main(String[] args) {
        Ipod ipod = new ReprodutorMusical();
        ipod.pausar();
    }

    @Override
    public void tocar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void selecionarMusica() {

    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }
}