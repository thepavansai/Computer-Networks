import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] arg) throws Exception{
        Socket sc=new Socket("127.0.0.1",3000);
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        OutputStream op=sc.getOutputStream();
        PrintWriter pw=new PrintWriter(op,true);
        InputStream ip=sc.getInputStream();
        BufferedReader rcv= new BufferedReader(new InputStreamReader(ip));
        System.out.println("Start the chat ,Type and Press Enter to send");
        String rmsg, smsg;
        while(true){
            smsg = rd.readLine();
            pw.println(smsg);
            pw.flush();
            if((rmsg=rcv.readLine())!=null){
                System.out.println(rmsg);
            }
            
        }
    }
}
