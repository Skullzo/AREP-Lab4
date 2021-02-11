package edu.escuelaing.arep.app.web;
import edu.escuelaing.arep.app.anotaciones.Web;

public class WebServiceJs {
     /**
     * Shows a html with a js file
     *
     * @return html requesting a js
     */
    @Web("/js.html")
    public static String returnHtmlWithJS(){
        return "<html><head><script src=\"/hello.js\"></script></head><body><h1>JS!</h1></body></html>";
    }

}