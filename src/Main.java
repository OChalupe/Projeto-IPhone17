public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        // Teste Reprodutor Musical
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.tocar();
        iphone.pausar();
        
        // Teste Telefone
        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Teste Navegador
        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}