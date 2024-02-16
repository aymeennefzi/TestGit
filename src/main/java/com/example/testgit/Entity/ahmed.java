package com.example.testgit.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ahmed implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idahmed ;

}
