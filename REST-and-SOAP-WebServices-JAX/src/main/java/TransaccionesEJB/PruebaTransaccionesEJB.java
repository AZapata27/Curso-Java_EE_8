 
package TransaccionesEJB;

import org.apache.logging.log4j.*;
import service.PersonaService;
import domain.Persona;
import javax.inject.Inject;

/**
 *
 * @author AndresZ
 */
public class PruebaTransaccionesEJB {
    
    static Logger log = LogManager.getLogger();
    
    @Inject
    PersonaService personaService;
    
  
        
     
        Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
        
  
    


}
