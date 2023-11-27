/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cifradortexto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CifradoRMI extends Remote {
    void cifrarPorHilos(String[] texto) throws RemoteException;
    void registerClient(ClientCallback client) throws RemoteException;    
    void sendResult(String[] message, int identifier)throws RemoteException;
}
