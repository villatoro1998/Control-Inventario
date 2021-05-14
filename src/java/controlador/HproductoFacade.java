/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Hproducto;

/**
 *
 * @author William Villatoro
 */
@Stateless
public class HproductoFacade extends AbstractFacade<Hproducto> {

    @PersistenceContext(unitName = "InventarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HproductoFacade() {
        super(Hproducto.class);
    }
    
}
