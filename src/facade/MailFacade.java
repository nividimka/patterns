package facade;

import facade.complex.Autentification;
import facade.complex.MailSystem;
import facade.complex.NotificationControl;

public class MailFacade {
    Autentification autentification = new Autentification();
    MailSystem mailSystem = new MailSystem();
    NotificationControl notificationControl = new NotificationControl();
    public void sendMail(String msg, String to){
        if(autentification.isAuthentificated()){
            mailSystem.sendMail(msg,to);
            notificationControl.notifySendingMail(to);
        }
    }
}
