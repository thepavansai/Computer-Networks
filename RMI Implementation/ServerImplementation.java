import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface{
    ServerImplementation() throws RemoteException
    {}
    public double add(double a, double b)throws RemoteException{
        return (a+b);
    }
}