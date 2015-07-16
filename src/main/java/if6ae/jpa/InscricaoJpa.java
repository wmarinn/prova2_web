/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.jpa;

import if6ae.entity.Inscricao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author user
 */
public class InscricaoJpa extends JpaController{
    
    public Inscricao findByNumero(int numero){
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Inscricao> cq = cb.createQuery(Inscricao.class);
            Root<Inscricao> ri = cq.from(Inscricao.class);
            cq.where(cb.equal(ri.get(Inscricao_.numero), numero));
            TypedQuery<Inscricao> i = em.createQuery(cq);
            return i.getSingleResult();
        } finally {
            em.close();
        }
    }
    
    public Inscricao findByCpf(long cpf){
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Inscricao> cq = cb.createQuery(Inscricao.class);
            Root<Inscricao> ri = cq.from(Inscricao.class);
            cq.where(cb.equal(ri.get(Inscricao_.cpf), cpf));
            TypedQuery<Inscricao> i = em.createQuery(cq);
            return i.getSingleResult();
        } finally {
            em.close();
        }
    }
    
}
