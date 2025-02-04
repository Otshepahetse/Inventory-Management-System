package com.Otshepahetse.Inventory.Management.System.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Supplier")

public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String supplierName;
    private String supplierContactNumber;
    private String supplierEmail;
    @Column(name = "supplier_number")
    private String supplierNo;

    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;

    public Supplier(String supplierName, String supplierContactNumber, String supplierEmail, String supplierNo, List<Product> products, long id) {
        this.supplierName = supplierName;
        this.supplierContactNumber = supplierContactNumber;
        this.supplierEmail = supplierEmail;
        this.supplierNo = supplierNo;
        this.products = products;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierContactNumber() {
        return supplierContactNumber;
    }

    public void setSupplierContactNumber(String supplierContactNumber) {
        this.supplierContactNumber = supplierContactNumber;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }
}
