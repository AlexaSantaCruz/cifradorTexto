/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradortexto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ClientCallbackImpl extends UnicastRemoteObject implements ClientCallback {


    public ClientCallbackImpl() throws RemoteException {

    }

    @Override
    public void receiveMessage(String[] message) throws RemoteException {

        System.out.println("Texto recibido: " + Arrays.toString(message));

        
        
    }
    @Override
    public void passMessage(){
        
    }

 
}
