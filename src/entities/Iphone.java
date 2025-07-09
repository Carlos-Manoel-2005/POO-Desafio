package entities;

public class Iphone implements PlayMusic,ElectronicDevice,InternetBrowser{
    
    
    @Override
    public void play(){
        System.out.println("Aparelho Iphone está reproduzindo a música");
    }
    @Override
    public void pause(){
        System.out.println("Aparelho Iphone parou a música");

    }
    @Override
    public void selectedMusic(String music){
        System.out.println("Aparelho Iphone selecionou a música: " + music );
    }
    
    @Override
    public void makeCall(String number){
        System.out.println("Ligando para: " + number);
    }
    @Override
    public void answerCall(){
        System.out.println("Ligação atendida");
    }
    
    @Override
    public void startVoiceMail(){
        System.out.println("Correio de voz iniciado");
    }
    
    @Override
    public void displayPage(String url){
        System.out.println("Conectando a " + url + "...");
        System.out.println("Página carregada com sucesso!");
    }
    
    @Override
    public void addNewTab(){
        System.out.println("Nova aba em branco aberta. Pode navegar para um novo endereço.");
    }
    
    @Override
    public void refreshPage(){
        System.out.println("Recarregando a página atual para obter o conteúdo mais recente...");
        System.out.println("Conteúdo atualizado!");
    }
}
