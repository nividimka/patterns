package template_method;

public abstract class Worker {
    public void dailyRoutine(){
        wakeUp();
        goToWork();
        work();
        goBackToHome();
        sleep();
    }
    protected void sleep(){
        System.out.println("worker sleep");
    }
    protected void goToWork(){
        System.out.println("worker go to work");
    }
    protected void goBackToHome(){
        System.out.println("worker go to home");
    }

    protected abstract void work();

    protected void wakeUp(){
        System.out.println("worker wake up");
    }
}
