/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dao;

import ec.edu.espe.model.EvaEvaluacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jolube
 */
@Stateless
public class EvaEvaluacionFacade extends AbstractFacade<EvaEvaluacion> {

    @PersistenceContext(unitName = "ec.edu.espe_evaluacion_docente-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaEvaluacionFacade() {
        super(EvaEvaluacion.class);
    }
    
}
