package rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static final String UNIC_BINDING_NAME = "server.reverse";


    public static void main(String[] args) throws Exception {
        //create object
        final ReverseImpl server = new ReverseImpl();
        //create registry with port
        final Registry registry = LocateRegistry.createRegistry(2099);
        //create a stub - special permitter for calling
        Remote stub = UnicastRemoteObject.exportObject(server, 0);
        //registration of my stub in registry
        registry.bind(UNIC_BINDING_NAME, stub);
        //sleep
        Thread.sleep(Integer.MAX_VALUE);
    }
}