/**
 * @author Firuz Ibragimov
 */

package karel_tcp;

import java.io.*; 
import java.net.*;
import javax.swing.*;

public class ClientFrame extends javax.swing.JFrame {
    public ClientFrame() {
        super("Client");
        initComponents();
        socket = null;
        out = null;
        in = null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ipTextField = new javax.swing.JTextField();
        portTextField = new javax.swing.JTextField();
        ipAddressField = new javax.swing.JTextField();
        portNumberField = new javax.swing.JSpinner();
        connectButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        statusField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        checksumButton = new javax.swing.JButton();
        checksumField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        loginField = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageServerArea = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ipTextField.setEditable(false);
        ipTextField.setText("Server's IP:");
        ipTextField.setBorder(null);
        ipTextField.setFocusable(false);

        portTextField.setEditable(false);
        portTextField.setText("Server's Port:");
        portTextField.setBorder(null);
        portTextField.setFocusable(false);

        ipAddressField.setText("127.0.0.1");
        ipAddressField.setBorder(null);

        portNumberField.setModel(new javax.swing.SpinnerNumberModel(1994, 1024, 65000, 1));

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        disconnectButton.setText("Disconnect");
        disconnectButton.setEnabled(false);
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Status:");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);

        statusField.setEditable(false);
        statusField.setText("not connected");
        statusField.setBorder(null);
        statusField.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ipAddressField)
                        .addComponent(portNumberField))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(statusField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(disconnectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disconnectButton)
                    .addComponent(connectButton))
                .addContainerGap())
        );

        messageArea.setEditable(false);
        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        jTextField3.setEditable(false);
        jTextField3.setText("Message to Server:");
        jTextField3.setBorder(null);
        jTextField3.setFocusable(false);

        checksumButton.setText("Checksum");
        checksumButton.setFocusable(false);
        checksumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checksumButtonActionPerformed(evt);
            }
        });

        checksumField.setEditable(false);
        checksumField.setText("0");
        checksumField.setBorder(null);
        checksumField.setFocusable(false);

        sendButton.setText("Send");
        sendButton.setEnabled(false);
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setText("Login:");
        jTextField4.setBorder(null);
        jTextField4.setFocusable(false);

        loginField.setEditable(false);
        loginField.setToolTipText("name should start with \"Robot \"");

        jTextField6.setEditable(false);
        jTextField6.setText("Password:");
        jTextField6.setBorder(null);
        jTextField6.setFocusable(false);

        passwordField.setEditable(false);
        passwordField.setToolTipText("integer representing the sum of each character of login ");

        messageServerArea.setEditable(false);
        messageServerArea.setColumns(20);
        messageServerArea.setRows(5);
        messageServerArea.setFocusable(false);
        jScrollPane2.setViewportView(messageServerArea);

        jTextField8.setEditable(false);
        jTextField8.setText("Messages from Server:");
        jTextField8.setBorder(null);
        jTextField8.setFocusable(false);

        loginButton.setText("Login");
        loginButton.setEnabled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(passwordField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checksumButton)
                                .addGap(18, 18, 18)
                                .addComponent(checksumField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checksumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checksumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(loginButton)
                        .addGap(16, 16, 16)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String readMessage(){
        String msg = "";
        try{
            msg = (String)in.readObject();
        }
        catch(IOException | ClassNotFoundException ex){}
        return msg;
    }
    private void sendMessage(String msg){
        try {
            out.writeObject(msg);
            out.flush();
        } 
        catch (IOException ex) {}
    }
    private void setupStreams(){
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();
            in = new ObjectInputStream(socket.getInputStream());
        } 
        catch (IOException e) {
            System.err.println("Couldn't get I/O for " + socket.getInetAddress());
        }
    }
    private void endConnection(){
        try {
            sendMessage("end");
            socket.close();
            in.close();
            out.close();
        } 
        catch (IOException ex) {
            System.out.println("something went wrong while closing connection");
        }
    }
    private void setLogedinState(){
        messageArea.setEnabled(true);
        messageArea.setEditable(true);
        sendButton.setEnabled(true);
        loginField.setEditable(false);
        passwordField.setEditable(false);
        loginButton.setEnabled(false);
        ipAddressField.setEditable(false);
        ipAddressField.setEnabled(false);
        portNumberField.setEnabled(false);
    }
    private void setConnectedState(){
        statusField.setText("connected");
        connectButton.setEnabled(false);
        disconnectButton.setEnabled(true);
        loginButton.setEnabled(true);
        loginField.setEditable(true);
        passwordField.setEditable(true);
        ipAddressField.setEditable(false);
        ipAddressField.setEnabled(false);
        portNumberField.setEnabled(false);
    }
    private void setDisconnectedState(){
        statusField.setText("not connected");
        messageArea.setText("");
        loginField.setText("");
        passwordField.setText("");
        connectButton.setEnabled(true);
        disconnectButton.setEnabled(false);
        loginButton.setEnabled(false);
        loginField.setEditable(false);
        passwordField.setEditable(false);
        sendButton.setEnabled(false);
        messageArea.setEditable(false);
        ipAddressField.setEditable(true);
        ipAddressField.setEnabled(true);
        portNumberField.setEnabled(true);
    }
    
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        if(connectButton.isEnabled()){
            try{
                int port = (int) portNumberField.getValue();
                socket = new Socket(InetAddress.getByName(ipAddressField.getText()), port);
            }
            catch(NullPointerException | IOException e){
                JOptionPane.showMessageDialog(null, "Can not establish connection.\n" +
                            "Make sure you've entered the right IP and port number", "Connection Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            setConnectedState();
            setupStreams();
            String msg = readMessage();
            messageServerArea.append(msg + "\n");
        }
    }//GEN-LAST:event_connectButtonActionPerformed
    private void disconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectButtonActionPerformed
        if(disconnectButton.isEnabled()){
            endConnection();
            setDisconnectedState();
        }
    }//GEN-LAST:event_disconnectButtonActionPerformed
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if(loginButton.isEnabled()){
            String msg;
            String name = loginField.getText();
            String pass = passwordField.getText();
            sendMessage(name);
            sendMessage(pass);
            msg = readMessage();
            messageServerArea.append(msg + "\n");
            if(msg.startsWith("500") || msg.startsWith("502"))
                setDisconnectedState();
            else{
                setLogedinState();
                statusField.setText(name.substring(5));
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        if(sendButton.isEnabled()){
            String msg = messageArea.getText();
            sendMessage(msg);
            String recieved = readMessage();
            messageServerArea.append(recieved + "\n");
            if(recieved.startsWith("300")){
                messageArea.setText(msg.substring(0, msg.length()-8));
                return;
            }
            else if(!recieved.startsWith("202"))
                setDisconnectedState();
            messageArea.setText("");
        }
    }//GEN-LAST:event_sendButtonActionPerformed
    private void checksumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checksumButtonActionPerformed
        if(checksumButton.isEnabled()){
            String msg = messageArea.getText();
            if(msg.length() < 8)
                return;
            msg = msg.substring(5);
            int pos = 0;
            long sum = 0;
            
            for (int i = 0; i < msg.length(); i++){
                if(Character.isDigit(msg.charAt(i)))
                    pos++;
                else
                    break;
            }
            msg = msg.substring(++pos);
            for (int i = 0; i < msg.length(); i++)
                sum += msg.charAt(i);
            msg = Long.toHexString(sum);
            int tmp = 8-msg.length();
            for (int i = 0; i < tmp; i++)
                msg = "0".concat(msg);
            checksumField.setText(msg);
        }
    }//GEN-LAST:event_checksumButtonActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                new ClientFrame().setVisible(true);
            }
        });
    }

    
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checksumButton;
    private javax.swing.JTextField checksumField;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton disconnectButton;
    private javax.swing.JTextField ipAddressField;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JTextArea messageServerArea;
    private javax.swing.JTextField passwordField;
    private javax.swing.JSpinner portNumberField;
    private javax.swing.JTextField portTextField;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField statusField;
    // End of variables declaration//GEN-END:variables
}
