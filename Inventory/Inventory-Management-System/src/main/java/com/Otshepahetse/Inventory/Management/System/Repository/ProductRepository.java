package com.Otshepahetse.Inventory.Management.System.Repository;


import com.Otshepahetse.Inventory.Management.System.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findBySupplierId(Long supplierId);
}
