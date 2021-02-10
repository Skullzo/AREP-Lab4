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
        return "<html><body><h1>Image</h1><img src=\"/java.png\"></body></html>";
    }
}
