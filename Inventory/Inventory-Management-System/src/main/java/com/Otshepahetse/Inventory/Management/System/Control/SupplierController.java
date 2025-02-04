package com.Otshepahetse.Inventory.Management.System.Control;

import com.Otshepahetse.Inventory.Management.System.Model.Supplier;
import com.Otshepahetse.Inventory.Management.System.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titeninventory/Suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping
    public Supplier addSupplier(@RequestBody Supplier supplier){
        return supplierService.createSupplier(supplier);
    }

    @GetMapping
    public List<Supplier>getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable Long id){
        return supplierService.getSupplierById(id);
    }

    @PostMapping("/{id}")
    public Supplier updateSupplierById(@PathVariable Long id,@RequestBody Supplier updatedSupplier){
        return supplierService.updateSupplier(id, updatedSupplier);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable Long id){
        supplierService.deleteSupplier(id);
    }
}
