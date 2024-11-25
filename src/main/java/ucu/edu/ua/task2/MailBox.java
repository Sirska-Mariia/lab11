package ucu.edu.ua.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();
    private final MailSender sender = new MailSender();

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() {
        for (MailInfo info : infos) {
            sender.sendMail(info);
        }
        infos.clear();
    }
}
