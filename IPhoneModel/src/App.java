public class App {
    public static void main(String[] args) {
        // Criando um iPhone
        iPhone meuIphone = new iPhone();

        // Testando o Reprodutor Musical
        System.out.println("=== Testando o Reprodutor Musical ===");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o Aparelho Telefônico
        System.out.println("\n=== Testando o Aparelho Telefonico ===");
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        System.out.println("\n=== Testando o Navegador na Internet ===");
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    } 
}
