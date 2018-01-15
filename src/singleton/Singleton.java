package singleton;

public class Singleton {
    private static Singleton instance;
    private String version = "12.1.3";
    private Singleton() {
        System.out.println("Constructor called");
    }

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
