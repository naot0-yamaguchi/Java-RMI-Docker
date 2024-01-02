import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRMIServerImpl extends UnicastRemoteObject implements MyRMIServer {
    public MyRMIServerImpl() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello, from the RMI server!";
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            MyRMIServerImpl server = new MyRMIServerImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("MyRMIServer", server);
            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
