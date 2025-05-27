import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Main {
    static Properties prop;
    static Session session;
    static MimeMessage message;

    public static void main(String[] args) throws Exception{
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
    }
    
    public static void generateAndSendEmail() throws Exception {
        final String user = "qocnsqhs@naver.com"; //발신자의 이메일 아이디를 입력
        final String password = "";

    // Step1 프로퍼티 생성
        prop = new Properties();
        //"mail.smtp.host" 은 이메일 발송을 처리해줄 SMTP 서버를 나타냄
        //gmail을 사용할 때는 "smtp.gmail.com", 네이버는 "smtp.naver.com"
        prop.put("mail.smtp.host", "smtp.naver.com");
        //"mail.smtp.port "은 SMTP서버와 통신하는 포트를 말하는데 daum.,gmail일 겨우 465를 Naver은 587 사용
        prop.put("mail.smtp.port", 465);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.naver.com");

    // Step2 세션 설정
        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

    // Step3 메세지 작성
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));

            //수신자메일주소
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("qocnsqhs@naver.com"));

            // Subject
            message.setSubject("제목을 입력하세요"); //메일 제목을 입력

            // Text
            message.setText("내용을 입력하세요"); //메일 내용을 입력

            // Step4 이메일 보내기
            Transport.send(message); //전송
            System.out.println("message sent successfully...");
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}