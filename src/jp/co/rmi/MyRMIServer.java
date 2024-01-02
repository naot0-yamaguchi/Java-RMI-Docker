import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRMIServer extends Remote {
    String sayHello() throws RemoteException;
}
