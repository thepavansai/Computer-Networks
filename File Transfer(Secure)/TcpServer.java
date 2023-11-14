import java.io.*;
import java.net.*;
public class TcpServer {
    static int sf=3;
    public static void main(String [] args){
        try{
            ServerSocket scr=new ServerSocket(3000);
            System.out.println("Connection Established between client andd Server : "+scr.getInetAddress());
            Socket soc=scr.accept();
            InputStream in=soc.getInputStream();
            FileOutputStream f=new FileOutputStream("rcv.txt");
            byte[] buffer =new byte[1024];
            int bread;
            while((bread=in.read(buffer))!=-1){
                for(int y=0;y<bread;y++){
                    buffer[y]=(byte)(buffer[y]-sf);
                }
            f.write(buffer,0,bread);
            }
            f.close();
            in.close();
            soc.close();
            scr.close();
            System.out.println("File Received and Decrypted Sucessfully");
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        } 
    }
    
}
