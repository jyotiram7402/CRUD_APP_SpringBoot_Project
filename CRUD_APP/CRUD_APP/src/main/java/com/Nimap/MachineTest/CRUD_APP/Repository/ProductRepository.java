package com.Nimap.MachineTest.CRUD_APP.Repository;


import com.Nimap.MachineTest.CRUD_APP.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
