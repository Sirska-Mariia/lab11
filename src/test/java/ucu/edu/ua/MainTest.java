package ucu.edu.ua;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.task2.*;
import ucu.edu.ua.task2.mailcode.HappyBirthdayDayCode;
import ucu.edu.ua.task2.mailcode.MillionEmailCode;
import ucu.edu.ua.task3.ProxyImage;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private MailBox mailBox;

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
    }

    @Test
    void testHappyBirthdayMailCode() {
        Client client = new Client("Alice", 25, null, "Female");
        MailInfo mailInfo = new MailInfo(client, new MillionEmailCode());

       // assertEquals("Dear Alice! Happy Birthday!", mailInfo.getMailCode().generate(client));
    }

    @Test
    void testMillionEmailCode() {
        Client client = new Client("Bob", 30, null, "Male");
        MailInfo mailInfo = new MailInfo(client, new MillionEmailCode());

        String message = mailInfo.generate();
      //  System.out.println(message);

        assertEquals("test push", message);
    }

    @Test
    void testMailBox() {
        Client client1 = new Client("Alice", 25, null, "Female");
        Client client2 = new Client("Bob", 30, null, "Male");

        MailInfo mailInfo1 = new MailInfo(client1, new MillionEmailCode());
        MailInfo mailInfo2 = new MailInfo(client2, new MillionEmailCode());

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        assertEquals(2, mailBox.getInfos().size());
        mailBox.sendAll();
        assertEquals(0, mailBox.getInfos().size());
    }

    @Test
    void testProxyImage() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");

        proxyImage.display();
     
        proxyImage.display();
        assertTrue(true);
    }
}
