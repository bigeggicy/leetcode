/**
 * Created by bigegg on 2017/3/2 0002.
 */


interface send{
    public void send();
}

class sendsms implements send{
    @Override
    public void send() {
        System.out.print("sms");
    }
}
class sendmail implements send{
    @Override
    public void send() {
        System.out.print("mail");
    }
}

public class factory {
    public send produces(String s){
        if(s=="sms")return new sendsms();
        if(s=="mail")return new sendmail();
        else return null;
    }

    public static void main(String[] args) {
        factory factory = new factory();
        send sender = factory.produces("sms");
        sender.send();
    }

}
