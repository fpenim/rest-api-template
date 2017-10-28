package fpenim;

import fpenim.jetty.JettyServer;

/**
 * Created by flaviapenim on 27/Oct/2017.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {
        JettyServer jettyServer = new JettyServer();
        jettyServer.start();
    }
}
