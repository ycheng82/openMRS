/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.usagestatistics668.db.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.usagestatistics668.AccessEncounter;
import org.openmrs.module.usagestatistics668.db.AccessEncounterDAO;

/**
 *
 * @author Anthony Lee
 */
public class HibernateAccessEncounterDAO implements AccessEncounterDAO {

   private SessionFactory sessionFactory;

   /**
    * This is a Hibernate object. It gives us metadata about the currently
    * connected database, the current session, the current db user, etc. To save
    * and get objects, calls should go through
    * sessionFactory.getCurrentSession() <br/>
    * <br/>
    * This is called by Spring. See the /metadata/moduleApplicationContext.xml
    * for the "sessionFactory" setting. See the applicationContext-service.xml
    * file in CORE openmrs for where the actual "sessionFactory" object is first
    * defined.
    *
    * @param sessionFactory
    */
   public void setSessionFactory(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
   }

   public AccessEncounter getAccessEncounter(Integer id) {
      return (AccessEncounter) sessionFactory.getCurrentSession().get(AccessEncounter.class, id);
   }

   public void saveAccessEncounter(AccessEncounter accessEncounter) {
      sessionFactory.getCurrentSession().saveOrUpdate(accessEncounter);
   }

}
