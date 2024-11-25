package ucu.edu.ua.task2.mailcode;
import ucu.edu.ua.task2.Client;

public class HappyBirthdayDayCode implements MailCode {
    @Override
    public String generate(Client client){
        return String.format("Dear %s! Happy Birthday", client.getName());
    }

}

