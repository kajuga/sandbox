package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static final String UNIC_BINDING_NAME = "server.reverse";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.createRegistry(2099);
        Reverse service = (Reverse) registry.lookup(UNIC_BINDING_NAME);
        String result = service.reverse("Home sweet home");

    }


}
