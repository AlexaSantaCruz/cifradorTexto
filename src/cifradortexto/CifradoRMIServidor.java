/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradortexto;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CifradoRMIServidor extends UnicastRemoteObject implements CifradoRMI {
    public Map<Integer, ClientCallback> clientes;
    private cifradoHill hill;
    private int contadorClientes;

    public CifradoRMIServidor() throws RemoteException {
        clientes = new HashMap<>();
        hill = new cifradoHill();
        contadorClientes = 0;
    }

@Override
public void cifrarPorHilos(String[] texto) throws RemoteException {
    System.out.println("FUNCION CIFRAR POR HILOS");
    
        System.out.println(clientes.size());

    long tiempoInicioConHilos = System.currentTimeMillis();
    int numClientes = clientes.size();

    int palabrasPorCliente = texto.length / numClientes;
    int palabrasRestantes = texto.length % numClientes;
    int inicio = 0;
    
    System.out.println("Num clientes: " + numClientes);
    System.out.println("Palabras por cliente: " + palabrasPorCliente);
    System.out.println("Palabras restantes: " + palabrasRestantes);


    long tiempoFinConHilos = System.currentTimeMillis();
    long tiempoTotalConHilos = tiempoFinConHilos - tiempoInicioConHilos;
    System.out.println("Tiempo de ejecución (con hilos): " + tiempoTotalConHilos + " ms");
}


    
    public void connect(String Ip) {
        try {
            CifradoRMI service = new CifradoRMIServidor();

            LocateRegistry.createRegistry(9000);

            java.rmi.Naming.rebind("rmi://" + Ip + ":9000/CifradoRMI", service);

            System.out.println("Servidor de chat RMI listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

@Override
    public void registerClient(ClientCallback cliente) throws RemoteException {
    contadorClientes++;
    clientes.put(contadorClientes, cliente);
    
    // Imprimir el array de clientes
    System.out.println("Clientes registrados: " + Arrays.toString(clientes.keySet().toArray()));
    
    System.out.println("Cliente registrado: " + cliente.toString() + " - ID: " + contadorClientes);
    
}


//    @Override
//    public void unregisterClient(int clienteId) {
//        CifradoRMI cliente = clientes.remove(clienteId);
//        if (cliente != null) {
//            System.out.println("Cliente retirado: " + cliente.toString() + " - ID: " + clienteId);
//        }
//    }
}

    