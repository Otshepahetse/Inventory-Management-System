package com.Otshepahetse.Inventory.Management.System.Service;

import com.Otshepahetse.Inventory.Management.System.Model.Supplier;
import com.Otshepahetse.Inventory.Management.System.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier createSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    public Supplier getSupplierById(Long id){
        return supplierRepository.findById(id).orElseThrow(()->new RuntimeException("Supplier Not Found!"));
    }

    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }

    public Supplier updateSupplier(Long id,Supplier updatedSupplier){
        Supplier existingSupplier = supplierRepository.findById(id).orElseThrow(()->new RuntimeException("Supplier Not Found!"));

        existingSupplier.setSupplierName(updatedSupplier.getSupplierName());
        existingSupplier.setSupplierContactNumber(updatedSupplier.getSupplierContactNumber());
        existingSupplier.setSupplierEmail(updatedSupplier.getSupplierEmail());
        existingSupplier.setSupplierNo(updatedSupplier.getSupplierNo());

        return supplierRepository.save(existingSupplier);
    }

    public void deleteSupplier(long id){
        supplierRepository.deleteById(id);
    }

}
