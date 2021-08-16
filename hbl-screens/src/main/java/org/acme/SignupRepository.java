package org.acme;


import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class SignupRepository {

    @Inject
    EntityManager entityManager;


    @Transactional
    public void createCustomer(Signup customer) {

        entityManager.persist(customer);

    }


}