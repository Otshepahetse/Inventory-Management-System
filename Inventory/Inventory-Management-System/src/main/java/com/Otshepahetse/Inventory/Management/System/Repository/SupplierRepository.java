package com.Otshepahetse.Inventory.Management.System.Repository;

import com.Otshepahetse.Inventory.Management.System.Model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
