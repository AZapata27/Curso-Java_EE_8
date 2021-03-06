package web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import service.PersonaService;
import domain.Persona;
import java.util.List;
import javax.annotation.PostConstruct;
import org.apache.logging.log4j.*;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@RequestScoped
public class PersonaBean {
    
    Logger log= LogManager.getRootLogger();
    
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
    
    List<Persona> personas;

    public PersonaBean(){
        log.debug("Iniciando el objeto PersonaBean");
    }


        
    @PostConstruct
    public void inicializar(){
        //Iniciamos las variables
        this.personas = personaService.listarPersonas();
        log.debug("personas recuperadas en ManageBean: "+ this.personas);
        this.personaSeleccionada = new Persona();
    }
    
    public void editListener(RowEditEvent event){
        Persona persona= (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }
    
    public void registrarPersona(){
        
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada=null;
        
    }
    
    public void eliminarPersona(){
        
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(personaSeleccionada);
        this.personaSeleccionada=null;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}