import java.net.*;
import java.rmi.*;
public class Server{
    public static void main(String[] arg){
        try{
            ServerImplementation s=new ServerImplementation();
            Naming.rebind("RMServer", s);
            System.out.println("\nServer Started");
        }
        catch(Exception e){
            System.out.println("\nException Raised "+e);
        }
    }
}
