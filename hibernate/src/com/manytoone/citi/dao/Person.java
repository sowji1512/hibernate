package com.manytoone.citi.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Personmm")
@NamedQuery(query = "Select e from Person e where e.id = :id", name = "find Person by id")
public class Person {
  @Id
  private long id;
   
  private String name;
  
  
  @ManyToMany(mappedBy = "persons",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Department> departments = new HashSet<Department>();
  
  public Person() {}

  public Person(String name) {
    this.name = name;
  }

 
  public Set<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(Set<Department> departments) {
    this.departments = departments;
  }

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
  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", departments="
        + departments + "]";
  }


}