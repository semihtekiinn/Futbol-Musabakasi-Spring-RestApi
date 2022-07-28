package com.works.uygulama.entities;

import com.works.uygulama.utils.TEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tid;

    @Column(unique = true)
    private Integer fid;

    private TEnum name;
}
