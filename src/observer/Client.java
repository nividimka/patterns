package observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        CurrentConditionsDisplay currentDisplay1 = new CurrentConditionsDisplay();
        weatherData.attachObserver(currentDisplay);
        weatherData.attachObserver(currentDisplay1);
        weatherData.detachObserver(currentDisplay1);
        weatherData.detachObserver(currentDisplay);
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
