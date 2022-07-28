package com.works.uygulama.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class FootTeam {

    @Id
    private Integer tid;
    private String tname;
    private Integer fid;
    private String name;
    private String surname;
    private String email;
    private Integer age;

}
