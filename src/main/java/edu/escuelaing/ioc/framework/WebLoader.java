package edu.escuelaing.ioc.framework;

import edu.escuelaing.ioc.annotations.Web;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

/**
 *
 * @author alejo
 */
public class WebLoader {
    
    private Map<String, Method> urlMethod;
    public WebLoader() {
        urlMethod = new HashMap<>();
    }

    /**
     * Loads the classes from the 'edu.escuelaing.arep.web' package
     */
    public void init() {
        String webPackage = "edu.escuelaing.ioc.web";
        Reflections reflections = new Reflections(webPackage, new SubTypesScanner(false));
        Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
        for (Class cls : allClasses) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Web.class)) {
                    //System.out.println(method.getAnnotation(Web.class).value());
                    urlMethod.put(method.getAnnotation(Web.class).value(), method);
                }
            }
        }
    }

    /**
     * Tells if a resource is present
     *
     * @param resource The requested resource
     * @return True if present, otherwise false
     */
    public boolean isResourcePresent(String resource) {
        return urlMethod.containsKey(resource);
    }

    /**
     * Gets the requested resource
     *
     * @param resource The requested resource
     * @return The requested resource
     */
    public String getResource(String resource) {
        String res = null;
        try {
            res = (String) urlMethod.get(resource).invoke(null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("Error invoking method");
            res = "ERROR";
        }
        return res;
    }
}
