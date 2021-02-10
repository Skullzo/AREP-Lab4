package edu.escuelaing.ioc.web;

import edu.escuelaing.ioc.annotations.Web;

/**
 *
 * @author alejo
 */
public class WebServiceImage {
     /**
     * Shows an image from a html
     *
     * @return html with image
     */
    @Web("/image.html")
    public static String showImage() {
        return "<html><body><h1>Imagennnn</h1><body style = \"background: url(https://blog.redbus.co/wp-content/uploads/2019/08/Bandera-precidencial-1.jpg) no-repeat ; background-size: 100% 111%;\">\n"
        		+ "</body></body></html>";
    }
}
