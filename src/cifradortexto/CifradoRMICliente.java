/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradortexto;

import java.rmi.Naming;
import java.util.Arrays;
import java.rmi.RemoteException;


public class CifradoRMICliente {
        CifradoRMI cliente;
    

    public void connect(String ip) {
        try {
            // Busca el objeto remoto

            cliente = (CifradoRMI) Naming.lookup("//" + ip + ":9000/CifradoRMI");

            ClientCallbackImpl clientCallback = new ClientCallbackImpl();
            cliente.registerClient(clientCallback);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cifrarPorHilos(String[] subArray) throws RemoteException {
    // Implementa aquí la lógica para cifrar el subarray recibido
    // Puedes imprimirlo en la consola o realizar cualquier otra operación
    System.out.println("Subarray recibido: " + Arrays.toString(subArray));
}

}

