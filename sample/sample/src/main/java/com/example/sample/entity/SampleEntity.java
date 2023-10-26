package com.example.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sample")
public class SampleEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fact;
    private int length;
}
