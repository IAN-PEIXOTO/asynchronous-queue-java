package com.estudojava.infrastructure;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;

public class jpaUtil {

        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ian");

        public static EntityManager getEntityManager(){
            return emf.createEntityManager();
    }
}
