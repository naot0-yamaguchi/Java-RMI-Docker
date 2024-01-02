import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRMIClientImpl implements MyRMIClient {
    public MyRMIClientImpl() throws RemoteException {
    }

    public String callServer() throws RemoteException {
        try {
            String serverHost = InetAddress.getByName("rmi-server").getHostAddress();
            System.out.println("serverHost: " + serverHost);

            MyRMIServer server = (MyRMIServer) Naming.lookup("//" + serverHost + ":1099/MyRMIServer");
            return server.sayHello();
        } catch (UnknownHostException | NotBoundException | MalformedURLException e) {
            throw new RemoteException("RMI call failed", e);
        }
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            MyRMIClient client = new MyRMIClientImpl();
            String result = client.callServer();
            System.out.println("Response from server: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
