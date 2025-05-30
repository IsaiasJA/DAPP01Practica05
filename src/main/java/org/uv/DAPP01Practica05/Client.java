package org.uv.DAPP01Practica05;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue(
            generator = "client_id_seq",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "client_id_seq",
            sequenceName = "client_id_seq",
            initialValue = 1,
            allocationSize = 1)
    @Column
    private Long id;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
