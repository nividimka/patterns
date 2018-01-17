package adapter;

//Adaptee
public class Plumber {
    public Object getScrewNut(){
        System.out.println("screwNut");
        return new Object();
    }

    public Object getPipe(){
        System.out.println("pipe");
        return new Object();
    }

    public Object getGasket(){
        System.out.println("gasket");
        return new Object();
    }
}
