package com.cg.fms.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;



@Data 
@NoArgsConstructor

@Entity
@Table(name="Cart_tbl")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cart_id;

   
    @Column(name = "cart_item")
   private  String cart_item;

    @Column(name = "Quantity")
  
    private String Quantity;
    
   @Column(name="price")
   private String price;
   
}

  