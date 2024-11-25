package ucu.edu.ua.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import ucu.edu.ua.task2.mailcode.MailCode;
import ucu.edu.ua.task2.mailcode.MillionEmailCode;

//import java.security.PrivateKey;
@AllArgsConstructor
@Data
public class MailInfo {
    private Client client;
    private int mailCode;
    
  

    public String generate() {

   //     return mailCode.generate(client);
   // }

        if (mailCode == 1){
            return "Hello";
        }
        else if (mailCode == 2) {
            return "You won $1,000,000!";
        }
        return "test push";
        
    }



    public MailInfo(Client client2, MillionEmailCode millionEmailCode) {
      //  thi.
        //TODO Auto-generated constructor stub
    }
}
