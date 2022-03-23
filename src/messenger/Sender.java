package messenger;

/**
 *
 * @author sye
 */
public class Sender {
    public static void main(String[] args) {
        var std = new StdMessenger();
        
        System.out.println("== STD MESSENGER ==");
        std.sendMessege("Mark", "how are you?", "Hi Mark, how are you? I'm fine fyi, I hope you too :)");
        System.out.println("\n");
        std.sendMessege("", "spam", "idk what I'm doing :(");
        
        var mail = new MailMessenger();
        
        System.out.println("\n\n== MAIL MESSENGER ==");
        mail.connect();
        System.out.println("\n");
        mail.sendMessege("Mom", "miss you", "Hi mom~ I miss you! hehe");
        System.out.println("\n");
        mail.disconnect();
        System.out.println("\n");
        mail.sendMessege("", "test", "Hi Myself LOL");
        System.out.println("\n");
        mail.connect();
        System.out.println("\n");
        mail.sendMessege("", "s", "asdfghjkl");
        System.out.println("\n");
        mail.disconnect();
    }  
}