package es.uc3m.tiw.web.configuracion;

import javax.ws.rs.core.Application;

import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class ApplicationConfig extends Application {

public Set<Class<?>> getClasses() {
return getRestClasses();
}

//Auto-generated from RESTful web service wizard
private Set<Class<?>> getRestClasses() {
Set<Class<?>> resources = new java.util.HashSet<Class<?>>();

resources.add(es.uc3m.tiw.web.PasarelaService.class);
return resources;
}
}