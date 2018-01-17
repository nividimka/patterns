package adapter;

public class ChiefAdapter implements Chief {
    Plumber plumber = new Plumber();
    public ChiefAdapter() {

    }

    @Override
    public Object makeBreakfast() {
        return plumber.getGasket();
    }

    public Object makeLunch() {
        return plumber.getPipe();
    }

    public Object makeDinner() {
        return plumber.getScrewNut();
    }
}