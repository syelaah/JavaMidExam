package messenger;

/**
 *
 * @author sye
 */
public class StdMessenger implements Messenger {
    private boolean isSuccess;
    
    @Override
    public void sendMessege(String receiver, String subject, String messege){
        System.out.println("receiver\t: " + receiver);
        System.out.println("subject\t\t: " + subject);
        System.out.println("messege\t\t: " + messege);
        
        if(receiver == ""){
            isSuccess = false;
            System.out.println("status messege\t: message not sent successfully");
        } else{
            isSuccess = true;
            System.out.println("status messege\t: message sent successfully");
        }
    }
}
