package com.works.uygulama.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Footballer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;

    @NotBlank(message = "Lutfen adinizi giriniz !")
    private String name;

    @NotBlank(message = "Lutfen soyad giriniz.")
    private String surname;

    @Column(unique = true)
    @Email(message = "Email formati hatali !")
    private String email;

    private Integer password;

    @Min(message = "Lutfen 18 yas ve ustu deger giriniz.", value = 18)
    private Integer age;


}
