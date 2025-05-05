package Desafio;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página...");;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba.");;
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para número...");;
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada?");;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando correio de voz...");;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");;
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");;
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar música:");;
    }
}
