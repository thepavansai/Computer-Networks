import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket sr=new ServerSocket(3000);
        System.out.println("Server Ready to Communicate: ");
        Socket sck=sr.accept();
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        OutputStream op=sck.getOutputStream();
        PrintWriter pw=new PrintWriter(op,true);
        InputStream ip=sck.getInputStream();
        BufferedReader rcv= new BufferedReader(new InputStreamReader(ip));
        System.out.println("Start the chat ,Type and Press Enter to send");
        String rmsg, smsg;
        while(true){
             if((rmsg=rcv.readLine())!=null){
                System.out.println(rmsg);
            }
            
            smsg = rd.readLine();
            pw.println(smsg);
            pw.flush();
           
        }
    }
    
}
