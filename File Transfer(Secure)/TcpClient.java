import java.net.*;
import java.io.*;
public class TcpClient {
    static int sf=3;
    public static void main(String [] args){
        try{
            Socket sc=new Socket("localhost",3000);
            File snd=new File("sendi.txt");
            FileInputStream f= new FileInputStream(snd);
            OutputStream out =sc.getOutputStream();
            byte[] buffer=new byte[1024];
            int bread;
            while((bread=f.read(buffer))!= -1){
                for (int x=0;x<bread;x++){
                    buffer[x]=(byte)(buffer[x]+sf);
                }
            out.write(buffer,0,bread);
            }
            f.close();
            out.close();
            sc.close();
            System.out.println("File Successfully Encrypted and Sent");
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
}
