package com.bangsacerdas.Academic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bangsacerdas.Academic.Models.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
