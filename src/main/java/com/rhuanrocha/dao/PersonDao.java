package com.rhuanrocha.dao;

import com.rhuanrocha.model.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Stateless
public class PersonDao {

    @PersistenceContext
    protected EntityManager em;

    public Optional<Person> findById(Long id){

        return Optional.ofNullable(em.find(Person.class, id));
    }

    public List<Person> findAll(){

        return em.createQuery("select p from "+Person.class.getName()+" p ", Person.class)
                .getResultList();

    }

    public Person save(Person person){
        return em.merge(person);
    }
}
