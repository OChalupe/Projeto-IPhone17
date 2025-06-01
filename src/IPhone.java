public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionada: " + musica);
    }
    
    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
    
    // Navegador Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}