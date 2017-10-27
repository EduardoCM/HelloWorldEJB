package org.ipn.escom;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEJBImpl implements HolaMundoEJB{

    @Override
    public String saludarConEJB(String name) {
          return "Hello world in EJB: " + name;
    }
    
}
