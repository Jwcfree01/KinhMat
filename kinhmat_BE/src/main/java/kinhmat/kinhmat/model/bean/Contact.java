package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idContact;
    private String Email;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    @JsonBackReference
    private Customer customer;

    public Contact() {
    }
}
