package es.uc3m.tiw.model.daos;


import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.Cuenta;


public class CuentaDAO {

	private final EntityManager em;
    private final UserTransaction ut;
    
 public CuentaDAO(EntityManager em, UserTransaction ut) {
		super();
		this.em = em;
		this.ut = ut;
	}
//private Long id;
	
 public Cuenta guardarCuenta(Cuenta nuevoCuenta) throws Exception{
	 ut.begin();
	 em.persist(nuevoCuenta);
	 ut.commit();
	 return nuevoCuenta;
 }
 public Cuenta actualizarCuenta(Cuenta actualCuenta) throws Exception{
	 ut.begin();
	 em.merge(actualCuenta);
	 ut.commit();
	 return actualCuenta;
 }
 public void borrarCuenta(Cuenta Cuenta) throws Exception{
	 ut.begin();
	 em.remove(em.merge(Cuenta));
	 ut.commit();
	 
 }
 /*
  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
    return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
 }
  */
    public Cuenta buscarCuenta(Long id) {
        return em.find(Cuenta.class, id);
    } 
 
 
 
 
 
 
 
 
 
 
 
 




	
	
}
