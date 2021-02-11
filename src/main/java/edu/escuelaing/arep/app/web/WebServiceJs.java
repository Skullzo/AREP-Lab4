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
        return "<html><head><script src=\"/agradecimiento.js\"></script></head>"
        		+ "<body style = \"background: url(https://i.pinimg.com/originals/19/3e/cb/193ecbf389570118d51e658cfefc9746.jpg) no-repeat ; background-size: 100% 111%;\">\r\n"
        		+ "</body>"
        		+ "</html>";
    }
}