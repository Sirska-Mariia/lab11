package ucu.edu.ua.task2;

import java.time.LocalDate;

import ucu.edu.ua.task2.mailcode.MillionEmailCode;

public class Main {

    Client client = new Client("Oles", 0, LocalDate.of(1991,3,14), null);
    MailInfo mailInfo = new MailInfo(client, new MillionEmailCode());
    //System.out.println(mailInfo.generate());
}

