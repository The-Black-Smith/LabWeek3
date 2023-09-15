/**
 * @author Alec Smith - ajsmith44 
 * CIS175 Fall 2023
 * Sep 13, 2023
 */
package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListItem;

/**
 * 
 */
public class ListItemHelper {
	static EntityManagerFactory emfactory =
			Persistence.createEntityManagerFactory("ShoppingList");

	public void
	 insertItem(ListItem li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();

	}

	/**
	 * @param idToEdit
	 * @return
	 */
	public ListItem searchForItemById(int idToEdit) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param toEdit
	 */
	public void updateItem(ListItem toEdit) {
		// TODO Auto-generated method stub
		
	}
}
