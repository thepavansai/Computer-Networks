import java.rmi.*;
public interface ServerInterface extends Remote{
    int i=0;
    double add(double a, double b) throws RemoteException;
}