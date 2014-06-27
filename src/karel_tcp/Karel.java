/**
 * @author Firuz Ibragimov
 */

package karel_tcp;

public class Karel {
    public static void main(String args[]) {
        Server server = new Server();
        server.setVisible(true);
        server.svr_run();
    } 
}
