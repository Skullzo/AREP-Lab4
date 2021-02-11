package edu.escuelaing.arep.app.web;
import edu.escuelaing.arep.app.anotaciones.Web;

public class WebServiceImage {
     /**
     * Shows an image from a html
     *
     * @return html with image
     */
    @Web("/image.html")
    public static String showImage() {
        return "<html><body><img src=\"/Wallpaper.jpg\" width=\"1800\" height=\"950\"></body></html>";
    }
}