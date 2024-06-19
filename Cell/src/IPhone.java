import java.util.ArrayList;
import java.util.List;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private int volume;
    private List<String> callHistory = new ArrayList<>();
    private List<String> messageHistory = new ArrayList<>();
    private List<String> browserHistory = new ArrayList<>();
    
    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }

    @Override
    public void adjustVolume(int level) {
        this.volume = level;
        System.out.println("Volume set to " + level);
    }
    
    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
        callHistory.add("Called: " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Receiving call from " + number);
        callHistory.add("Received call from: " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
        messageHistory.add("Sent to " + number + ": " + message);
    }
    
    // Implementação dos métodos de NavegadorInternet
    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url);
        browserHistory.add("Visited: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page.");
    }

    @Override
    public void viewHistory() {
        System.out.println("Browser History:");
        for (String entry : browserHistory) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.play();
        iphone.adjustVolume(5);
        iphone.makeCall("123-456-7890");
        iphone.sendMessage("123-456-7890", "Hello!");
        iphone.navigateTo("http://example.com");
        iphone.viewHistory();
    }
}
