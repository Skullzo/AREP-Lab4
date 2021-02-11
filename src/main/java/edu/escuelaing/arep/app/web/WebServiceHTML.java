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
        return "<html>"
        		+ "<head>"
        		+ "<title>Registro Civil</title>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "	<div style=\"padding:30px; width:96.9%; background:#008000; color:white; font-size:400%; position:absolute ; top:0px ; left:0px\">\r\n"
        		+ "	<center>Registraduria Nacional del Estado Civil</center>\r\n"
        		+ "	</div>\r\n"
        		+ "	<div style=\"padding:30px; width:96.9%; background:#008000; color:white; font-size:150%; position:absolute ; top:120px ; left:0px\">\r\n"
        		+ "	<center>Aqui podras encontrar el nombre y la direccion de los ciudadanos de Colombia.</center>\r\n"
        		+ "	</div>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "</body>\r\n"
        		+ "<body style = \"background: url(https://blog.redbus.co/wp-content/uploads/2019/08/Bandera-precidencial-1.jpg) no-repeat ; background-size: 100% 111%;\">\r\n"
        		+ "</body>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "	<br><br>\r\n"
        		+ "</html>";
    }
}