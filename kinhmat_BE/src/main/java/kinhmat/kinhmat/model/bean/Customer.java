package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCustomer;
    private String name;
    private String gender;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private Set<Bill> bills;

    @OneToOne
    @JoinColumn(name = "user_name")
    private User users;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private Set<Contact> contacts;

    public Customer() {
    }
}
