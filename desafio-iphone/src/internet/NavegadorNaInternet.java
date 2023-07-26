package internet;

public class NavegadorNaInternet implements Internet {
    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");

    }
}
