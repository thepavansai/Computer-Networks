import java.net.*;
import java.rmi.*;
public class Client {
    public static void main(String[] arg){
        try{
            String sName="rmi://"+arg[0]+"/RMServer";
            ServerInterface sp=(ServerInterface)Naming.lookup(sName);
            double a=600;
            double b=900;
            System.out.println("Addition  "+sp.add(a,b));
        }
        catch(Exception e){
            System.out.println("Exception "+e);

        }
    }
    
}
