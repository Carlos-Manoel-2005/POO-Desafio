package application;

import java.util.Scanner;

import entities.Iphone;

public class Program {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Iphone user = new Iphone();
        System.out.println("========Iphone=========");
        System.out.println("1 - Reprodutor de Música ");
        System.out.println("2 - Navegador de Internet" );
        System.out.println("3 - Aparelho telefônico ");
        System.out.println("=======================");

        System.out.print("Selecione o APP desejado: ");
        
        int escolhaApp = sc.nextInt();

        switch (escolhaApp) {
            case 1 -> showMusicMenu(user);
            case 2 -> showBrowserMenu(user);
            case 3 -> showPhoneMenu(user);
            default -> System.out.println("Opção inválida ");
        }

        System.out.println("Iphone Desligando");
        sc.close();
    }

    private static void showMusicMenu(Iphone music){
        int option;

        do{

            System.out.println("\n--- Reprodutor de Música ---");
            System.out.println("1 - Tocar");
            System.out.println("2 - Pausar");
            System.out.println("3 - Selecionar Música");
            System.out.println("0 - Voltar ao início");
            System.out.println();
            System.out.print("Escolha uma ação: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println();
                    music.play();
                }
                  
                case 2 -> {
                    System.out.println();
                    music.pause();
                }
                    
                case 3 -> {
                    System.out.print("Digite o nome da música: ");
                    String musica = sc.nextLine(); 

                    System.out.println();
                    music.selectedMusic(musica);
        
                }
                    
                case 0 -> {

                    System.out.println();
                    System.out.println("Fechando o Reprodutor...");
                }
                    
                default -> {

                    System.out.println();
                    System.out.println("Opção inválida!");
                }

            }
        }
        while(option != 0);

    }

        private static void showBrowserMenu(Iphone browser){
        int option;

        do{
            
            System.out.println("\n--- Navegador de Internet ---");
            System.out.println("1 - Exibir Página");
            System.out.println("2 - Adicionar Nova Aba");
            System.out.println("3 - Atualizar Página");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma ação: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Digite URL: ");
                    String urlOriginal =  sc.nextLine();
                    String urlTratada = urlOriginal.replaceAll("\\s+", "").toLowerCase();
                    
                    System.out.println();
                    browser.displayPage(urlTratada);
                }
                  
                case 2 -> {
                    System.out.println();
                    browser.addNewTab();
                }
                    
                case 3 -> {
                    System.out.println();
                    browser.refreshPage();
        
                }
                    
                case 0 -> {

                    System.out.println();
                    System.out.println("Fechando o Navegador...");
                }
                    
                default -> {

                    System.out.println();
                    System.out.println("Opção inválida!");
                }

            }
        }
        while(option != 0);

    }

    private static void showPhoneMenu(Iphone phone){
    int option;

    do{
            
        System.out.println("\n--- Aparelho Telefônico ---");
        System.out.println("1 - Fazer Chamada");
        System.out.println("2 - Atender Chamada");
        System.out.println("3 - Iniciar Correio de Voz");
        System.out.println("0 - Voltar");
        System.out.print("Escolha uma ação: ");
        option = sc.nextInt();
        sc.nextLine();

        switch (option) {

                case 1 -> {
                   String numeroLimpo;

                     while (true) {
                        System.out.print("Digite o número (com DDD): ");
                        String numeroOriginal = sc.nextLine();
                        numeroLimpo = numeroOriginal.replaceAll("[^0-9]", "");

                            if (numeroLimpo.length() == 10 || numeroLimpo.length() == 11) {
                            break; 
                            } 
                            else {
                            System.out.println("Número inválido! Por favor, insira um número com 10 ou 11 dígitos.");
                            }
                        }

                    String numeroFormatado = formatarTelefone(numeroLimpo);
                    System.out.println();
                    phone.makeCall(numeroFormatado);
                }
                  
                case 2 -> {
                    System.out.println();
                    phone.answerCall();
                }
                    
                case 3 -> {
                    System.out.println();
                    phone.startVoiceMail();
        
                }
                    
                case 0 -> {

                    System.out.println();
                    System.out.println("Fechando o Telefone...");
                }
                    
                default -> {

                    System.out.println();
                    System.out.println("Opção inválida!");
                }

            }
        }
        while(option != 0);

    }

private static String formatarTelefone(String numeroLimpo) {
    if (numeroLimpo.length() == 11) {

        return String.format("(%s) %s-%s",
                numeroLimpo.substring(0, 2),
                numeroLimpo.substring(2, 7),
                numeroLimpo.substring(7));

    } else if (numeroLimpo.length() == 10) {
        
        return String.format("(%s) %s-%s",
                numeroLimpo.substring(0, 2),
                numeroLimpo.substring(2, 6),
                numeroLimpo.substring(6));

    } else {
        
        return numeroLimpo;
    }
}

}
