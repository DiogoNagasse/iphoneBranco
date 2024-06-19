public interface AparelhoTelefonico {
    void makeCall(String number);
    void receiveCall(String number);
    void sendMessage(String number, String message);
}