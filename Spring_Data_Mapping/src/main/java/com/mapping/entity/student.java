package com.mapping.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class student {

    @Id
    private Integer sid;
    private String sName;
    private String sBranch;

    @OneToMany(mappedBy = "std")
    private List<Laptop> laptop;

}
