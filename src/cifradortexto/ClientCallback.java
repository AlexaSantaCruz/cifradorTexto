/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cifradortexto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {
    void receiveMessage(String[] message, CifradoRMI servidor, int identifier) throws RemoteException;
}