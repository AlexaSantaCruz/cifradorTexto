/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradortexto;

import java.rmi.Naming;
import java.util.Arrays;
import java.rmi.RemoteException;


public class CifradoRMICliente {
    

    public void connect(String ip, CifradoRMI service) {
        try {
            // Busca el objeto remoto

            service = (CifradoRMI) Naming.lookup("rmi://" + ip + ":9000/CifradoRMI");

            ClientCallbackImpl clientCallback = new ClientCallbackImpl();
            service.registerClient(clientCallback);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    


}

