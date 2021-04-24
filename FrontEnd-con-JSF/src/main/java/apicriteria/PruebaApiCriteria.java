
package apicriteria;

import domain.Persona;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import org.apache.logging.log4j.*;


public class PruebaApiCriteria {

    
         static Logger log = LogManager.getRootLogger();
         
         public static void main(String[] args) {
             
             
             
             
         
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
         
         EntityManager em = emf.createEntityManager();
         
         // Variables a usar
         
        
         CriteriaBuilder cb;
          CriteriaQuery<Persona> criteriaQuery ;
         Root<Persona> fromPersona;
         TypedQuery<Persona> query =null;
         Persona persona = null;
         
         List<Persona> personas= null;
         
         
         //Query utilizando el API de Criteria
       
         
         //1. Consulta de todas las personas
         
         
         //Paso 1 el objeto entity manager crea un instancia de CriteriaBuilder
         cb= em.getCriteriaBuilder();
          
          //paso 2  se crea un objeto CriteriaQuery
         criteriaQuery = cb.createQuery(Persona.class);
         
         //paso 3 creamos el objeto raiz de el query
         
         fromPersona= criteriaQuery.from(Persona.class);
         
         //paso 4 seleccionamos lo necesario del front
         
         criteriaQuery.select(fromPersona);
         
         //paso5 creamo el query typesafe
         
         query = em.createQuery(criteriaQuery);
         
         //paso 6  ejecutamos consulta
         
         personas = query.getResultList();
         
         
         
         //mostrarPersonas(personas);
           
   
        
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona p: personas){
            log.debug(p);
        }
    }
         
         
         
         
         
         
         
         
}
