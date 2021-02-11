package edu.escuelaing.arep.app.web;
import edu.escuelaing.arep.app.anotaciones.Web;

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