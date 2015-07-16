/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.jpa;

import if6ae.entity.Inscricao;
import if6ae.entity.Inscricao_minicurso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author user
 */
public class InscricaoMinicursoJpa extends JpaController{
    
    public List<Inscricao_minicurso> findInscricaoMinicursoByNumero(int numero){
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Inscricao_minicurso> cq = cb.createQuery(Inscricao_minicurso.class);
            Root<Inscricao_minicurso> ri = cq.from(Inscricao_minicurso.class);
            cq.where(cb.equal(ri.get(Inscricao_minicurso_.numero), numero));
            TypedQuery<Inscricao_minicurso> i = em.createQuery(cq);
            return i.getResultList();
        } finally {
            em.close();
        }
    }
    
}
