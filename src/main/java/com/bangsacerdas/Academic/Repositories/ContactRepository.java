package com.bangsacerdas.Academic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bangsacerdas.Academic.Models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
