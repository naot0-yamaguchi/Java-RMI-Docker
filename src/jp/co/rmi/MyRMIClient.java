package jp.co.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRMIClient extends Remote {
    String callServer() throws RemoteException;
}
