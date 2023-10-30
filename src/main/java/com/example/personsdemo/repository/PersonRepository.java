package com.example.customerdemo.repository;
import com.example.customerdemo.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository extends JpaRepository<Persons,Long> {
}
