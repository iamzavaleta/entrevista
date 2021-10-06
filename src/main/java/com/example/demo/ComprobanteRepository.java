package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComprobanteRepository extends CrudRepository<Comprobante, Integer> {

    //@Query("SELECT s FROM s where ")
}
