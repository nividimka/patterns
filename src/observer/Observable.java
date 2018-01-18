package observer;

interface Observable {
    void attachObserver(Observer o);
    void detachObserver(Observer o);
    void notifyObservers();
}