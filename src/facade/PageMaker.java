package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String fileName) {

        try {
            Properties mailProp = Database.getProperties("maildata");
            String userName = mailProp.getProperty(mailAddr);

            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s Page");
            writer.paragraph(userName + "의 페이지에 오신 걸 환영합니다.");
            writer.paragraph("메일을 기다리고 있습니다.");
            writer.mailto(mailAddr, userName);
            writer.close();

            System.out.println(fileName + " is created for " + mailAddr + " (" + userName + ")");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
