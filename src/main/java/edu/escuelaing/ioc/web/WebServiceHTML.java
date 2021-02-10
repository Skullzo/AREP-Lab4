package edu.escuelaing.ioc.web;

import edu.escuelaing.ioc.annotations.Web;

/**
 *
 * @author alejo
 */
public class WebServiceHTML {
     /**
     * Says hello in a html page
     *
     * @return html hello page
     */
    @Web("/hello.html")
    public static String sayHello() {
        return "<html><body><h1>Hello world!</h1></body></html>";
    }
}
