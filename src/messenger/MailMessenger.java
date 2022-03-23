package messenger;

/**
 *
 * @author sye
 */
public class MailMessenger implements Messenger {
    private boolean isSuccess;
    private boolean isConnectedToServer = false;
    
    public void connect(){
        isConnectedToServer = true;
        System.out.println("status server\t: connected to server");
    }
    
    public void disconnect(){
        isConnectedToServer = false;
        System.out.println("status server\t: disconnected to server");
    }
    
    @Override
    public void sendMessege(String receiver, String subject, String messege){
        System.out.println("receiver\t: " + receiver);
        System.out.println("subject\t\t: " + subject);
        System.out.println("messege\t\t: " + messege);
        
        if(isConnectedToServer == false){
            if(receiver == ""){
                isSuccess = false;
                System.out.println("status messege\t: message not sent successfully");
                System.out.println("status server\t: disconnected to server");
            } else{
                isSuccess = true;
                System.out.println("status messege\t: message not sent successfully");
                System.out.println("status server\t: disconnected to server");
            }
        } else{
            if(receiver == ""){
                isSuccess = false;
                System.out.println("status messege\t: message not sent successfully");
                System.out.println("status server\t: connected to server");
            } else{
                isSuccess = true;
                System.out.println("status messege\t: message sent successfully");
                System.out.println("status server\t: connected to server");
            }
        }
    }
}