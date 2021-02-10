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
        return "HTTP/1.1 200 OK \\r\\n\" + \"Content-Type: image/png \\r\\n\" + \"\\r\\n";
    }
}
//BufferedImage image = ImageIO.read(file);
//ByteArrayOutputStream ArrBytes = new ByteArrayOutputStream();
//DataOutputStream writeimg = new DataOutputStream(outClient);
//ImageIO.write(image, "PNG", ArrBytes);
//writeimg.writeBytes("HTTP/1.1 200 OK \r\n" + "Content-Type: image/png \r\n" + "\r\n");
//writeimg.write(ArrBytes.toByteArray());