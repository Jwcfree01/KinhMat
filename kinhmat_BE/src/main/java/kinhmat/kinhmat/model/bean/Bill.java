package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBill;

    @ManyToMany
    @JoinTable(name = "productDetails_bill",
            joinColumns = @JoinColumn(name = "idSPCT"),
            inverseJoinColumns = @JoinColumn(name = "idBill"))
    @JsonBackReference
    private Set<ProductDetails> productDetails;

    private int quantity;
    private String dateOfBill;
    private double totalPrice;
    private double totalPriceBill;

    @ManyToOne
    @JoinColumn(name = "id_customer", nullable = false)
    @JsonBackReference
    private Customer customer;


    public Bill() {
    }
}
