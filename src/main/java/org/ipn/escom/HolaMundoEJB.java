package org.ipn.escom;

import javax.ejb.Remote;


@Remote
public interface HolaMundoEJB {
    
    public String saludarConEJB(String name);
    
}
