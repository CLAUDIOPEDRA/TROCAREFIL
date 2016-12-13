/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */   package modelo;



 

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**Esta é a classe de envio de e-mail
 * 
 * @author Claudio Pedra
 */
public class Email {
    
    Email email;
    public Email(){
    
    }

    public void enviarEmail(String msg,String para){
       
    //public static void main(String args[]) {

    Properties props = new Properties();
            /** Parâmetros de conexão com servidor Gmail */
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.setSSLOnConnect","true");

            Session session = Session.getInstance(props,new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication("trocarefil@gmail.com", "TR0C4R3FIL");
                             }
                        });

            /** Ativa Debug para sessão */
            session.setDebug(true);

        try{



            Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("trocarefil@gmail.com")); //Remetente

                  Address[] toUser = InternetAddress 
                             .parse(para);  //Destinatário(s)

                  message.setRecipients(Message.RecipientType.TO, toUser);
                  message.setSubject("Testando envio de email");//Assunto
                  message.setText(msg);
                  


                  /**Método para enviar a mensagem criada*/
                  Transport.send(message);




        }catch(Exception e) {
            System.out.println( "Não funcionou " +e);

        }

    }
//}
}

