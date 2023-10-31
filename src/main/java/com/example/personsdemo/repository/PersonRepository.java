package com.example.personsdemo.repository;
import com.example.personsdemo.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository extends JpaRepository<Persons,Long> {
}
