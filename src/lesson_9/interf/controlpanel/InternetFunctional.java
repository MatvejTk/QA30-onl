package lesson_9.interf.controlpanel;

// ключевое слово interface это просто указание компилятору, что
// у нас не класс, а полностью абстрактный интерфейс
public interface InternetFunctional {
    // Classical interface
    void turnOnInternet();
    String getInternetInformation();
    boolean validateInternetPinCode(int pinCode);
    void callControlPanel();
}