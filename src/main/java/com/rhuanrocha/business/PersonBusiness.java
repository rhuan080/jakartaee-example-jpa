package com.rhuanrocha.business;


import com.rhuanrocha.dao.PersonDao;
import com.rhuanrocha.model.Person;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class PersonBusiness {

    @Inject
    protected PersonDao personDao;

    public Optional<Person> findById(Long id ){
        return personDao.findById( id );
    }

    public List<Person> findAll(){
        return personDao.findAll();
    }

    public Person save(Person person){
        return personDao.save( person );
    }

}
