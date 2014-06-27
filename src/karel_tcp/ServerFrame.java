/**
 * @author Firuz Ibragimov
 */


package karel_tcp;

import java.io.*;
import java.net.*;


public class ServerFrame extends javax.swing.JFrame {
    public ServerFrame() {
        super("Server");
        initComponents();
        connectedRobots = 0;
    }
    
    protected void appendActivity(String message){
        activityArea.append(message + "\n");
    }
    protected void appendRobotName(String robotName, InetAddress ip){
        robotNameArea.append(robotName + " " + ip + "\n");
    }
    protected void increaseRobotAmount(){
        connectedRobots++;
        connectedRobotsLabel.setText(Integer.toString(connectedRobots));
    }
    protected void decreaseRobotAmount(){
        connectedRobots--;
        connectedRobotsLabel.setText(Integer.toString(connectedRobots));
    }
    protected void deleteRobotName(String name){
        String newNames;
        String robots = robotNameArea.getText();
        int indFrom = robots.indexOf(name);
        int indTo = robots.indexOf(10, indFrom);
        if (indFrom == -1 || indTo == -1)
            return;
        newNames = robots.substring(0, indFrom);
        robots = robots.substring(indTo+1);
        newNames += robots;
        robotNameArea.setText(newNames);
    }
    @SuppressWarnings("unchecked")
    private int connectedRobots;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listenPanel = new javax.swing.JPanel();
        ipAddressField = new javax.swing.JTextField();
        portText = new javax.swing.JTextField();
        ipText = new javax.swing.JTextField();
        portNumber = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        connectedRobotsText = new javax.swing.JTextField();
        connectedRobotsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        robotNameArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityArea = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listenPanel.setName("Connection Properties"); // NOI18N

        ipAddressField.setEditable(false);
        ipAddressField.setText("127.0.0.1");
        ipAddressField.setFocusable(false);

        portText.setEditable(false);
        portText.setText("Port:");
        portText.setToolTipText("");
        portText.setBorder(null);
        portText.setFocusable(false);

        ipText.setEditable(false);
        ipText.setText("IP:");
        ipText.setBorder(null);
        ipText.setFocusable(false);

        portNumber.setEditable(false);
        portNumber.setText("1994");
        portNumber.setFocusable(false);

        javax.swing.GroupLayout listenPanelLayout = new javax.swing.GroupLayout(listenPanel);
        listenPanel.setLayout(listenPanelLayout);
        listenPanelLayout.setHorizontalGroup(
            listenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listenPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(listenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ipAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(portNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listenPanelLayout.setVerticalGroup(
            listenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listenPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(listenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        connectedRobotsText.setEditable(false);
        connectedRobotsText.setText("Connected Robots:");
        connectedRobotsText.setBorder(null);
        connectedRobotsText.setFocusable(false);

        connectedRobotsLabel.setText("0");
        connectedRobotsLabel.setFocusable(false);

        robotNameArea.setEditable(false);
        robotNameArea.setColumns(20);
        robotNameArea.setRows(5);
        robotNameArea.setFocusable(false);
        jScrollPane2.setViewportView(robotNameArea);

        activityArea.setEditable(false);
        activityArea.setColumns(20);
        activityArea.setRows(5);
        activityArea.setFocusable(false);
        jScrollPane1.setViewportView(activityArea);

        jTextField1.setEditable(false);
        jTextField1.setText("Activities:");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(connectedRobotsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(connectedRobotsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(connectedRobotsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(connectedRobotsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea activityArea;
    private javax.swing.JLabel connectedRobotsLabel;
    private javax.swing.JTextField connectedRobotsText;
    private javax.swing.JTextField ipAddressField;
    private javax.swing.JTextField ipText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel listenPanel;
    private javax.swing.JTextField portNumber;
    private javax.swing.JTextField portText;
    private javax.swing.JTextArea robotNameArea;
    // End of variables declaration//GEN-END:variables
}

class Server extends ServerFrame{
    private Socket client;
    private ServerSocket server;
    
    
    public Server(){
        client = null;
        server = null;
        try{
            PrintWriter pw = new PrintWriter("log.txt");
            pw.close();
            server = new ServerSocket(1994);
        }
        catch(IOException e){
            appendActivity("Could not listen on port: 1994\n");
        }
    }
    public void svr_run(){
        while(true){
            try {
                client = server.accept();
            } 
            catch (IOException e) {
                appendActivity("Acception failed.\n");
                System.exit(1);
            }
            appendActivity("Client accepted " + client.getInetAddress() + ":" + client.getPort() + "\n");
            (new Thread(new Connection(client, this))).start();
            increaseRobotAmount();
        }
    }
}
class Connection implements Runnable{
    private final Socket client;
    private final Server server;
    private FileWriter fileWriter;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private String data;
    private String name;
    
    public Connection(Socket client, Server server){
        this.client = client;
        this.server = server;
        data = "";
        try {
            fileWriter = new FileWriter("log.txt", true);
            out = new ObjectOutputStream(client.getOutputStream());
            out.flush();
            in = new ObjectInputStream(client.getInputStream());
        } 
        catch (IOException e) {
            System.err.println("Couldn't get I/O for " + client.getInetAddress());
        }
    }
    private int convertToDecimal(String msg){
        int decimal = 0;
        for (int i = 0; i < msg.length(); i++)
            decimal += (int) msg.charAt(i);
        return decimal;
    }
    private void sendMessage(String msg){
        try {
            out.writeObject(msg);
            out.flush();
        } 
        catch (IOException ex) {}
    }
    private void endConnection(){
        try {
            data += "\n===================================================================";
            fileWriter.write(data + "\n");
            out.close();
            client.close();
            server.appendActivity("Disconnected: " + name);
            server.decreaseRobotAmount();
            server.deleteRobotName(name);
            fileWriter.close();
        } 
        catch (IOException ex) {            
            System.err.println("Unsuccesfully closing session for client " + client.getInetAddress());
        }
    }
    private String readMessage()throws SocketTimeoutException, IOException{
        String msg = "";
        try{
            msg = (String)in.readObject();
        }
        catch(ClassNotFoundException e){}
        return msg;
    }
    private String parseMessage(String msg)throws SocketTimeoutException{
        
        if(msg.startsWith("INFO ")){
            data = data.concat("\n" + msg);
            return "OK";
        }
        if(!msg.startsWith("FOTO "))
            return "syntax";
        int len = 0;
        int i = 5;
        long sum = 0;
        String checkSum = "";
        
        while(Character.isDigit(msg.charAt(i))){
            len *= 10;
            len += Character.getNumericValue(msg.charAt(i));
            if(++i == msg.length()-1)
                return "syntax";
        }
        
        if(len == 0)
            return "syntax";
        if(msg.charAt(i) != ' ')
            return "syntax";
        
        ++i;
        for(int j = 0; j < len; ++j){
            if(i == msg.length()-1)
                return "syntax";
            sum += msg.charAt(i);
            ++i;
        }
        for(int j = 0; j < 8; ++j){
            if(i == msg.length())
                return "syntax";
            if(Character.digit(msg.charAt(i), 16) == -1)
                return "syntax";
            checkSum += msg.charAt(i);
            ++i;
        }
        
        if(i != msg.length())
            return "syntax";
        if(Long.parseLong(checkSum, 16) != sum)
            return "sum";
        msg = msg.substring(0, msg.length()-8);
        data = data.concat("\n" + msg);
        return "OK";        
    }
    @Override
    public void run(){
        try{
            client.setSoTimeout(45000);
            String msg;
            int nameInDecimal;
            int passInDecimal;
        
            sendMessage("200 LOGIN");
            name = readMessage();
            if(name.startsWith("Robot"))
                nameInDecimal = convertToDecimal(name);
            else
                nameInDecimal = -2;
            msg = readMessage();
            try{
                passInDecimal = Integer.parseInt(msg);
            }
            catch(NumberFormatException ex){
                passInDecimal = -1;
            }
            if(nameInDecimal != passInDecimal){
                sendMessage("500 LOGIN FAILED");
                endConnection();
                return;
            }
            name = name.substring(5);
            data = data.concat("Robot: " + name + "  IP: " + client.getInetAddress() + "\n");
            server.appendRobotName(name, client.getInetAddress());
            sendMessage("202 OK");
            do {
                msg = readMessage();
                msg = parseMessage(msg);
                if("end".equals(msg))
                    break;
                if("syntax".equals(msg)){
                    sendMessage("501 SYNTAX ERROR");
                    break;
                }
                if("sum".equals(msg))
                    sendMessage("300 BAD CHECKSUM");
                else
                    sendMessage("202 OK");
            }while(client.isConnected());
            endConnection();
        }
        catch(SocketTimeoutException e){
            server.appendActivity("TIMEOUT for " + name);
            sendMessage("502 TIMEOUT");
            endConnection();
        }
        catch(IOException e){}
    }
}