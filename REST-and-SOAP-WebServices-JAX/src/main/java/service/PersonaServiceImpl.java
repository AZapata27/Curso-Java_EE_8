/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import data.PersonaDao;
import domain.Persona;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonaServiceImpl implements PersonaService{
    
   @Inject
   private PersonaDao personaDao;
   
   @Resource
   private SessionContext contexto;

    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
       personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        
        try {
            personaDao.updatePersona(persona);
        } catch (Throwable t) {
            
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
            
        }
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
       personaDao.deletePersona(persona);
    }
    
}
