package com.techtitans.ecommerce.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "atlet")
@AllArgsConstructor
@NoArgsConstructor
public class Atlet {
	
	@Id
	@Column(name = "atlet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "spor")
	private String spor;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "imageUrl")
	private String imageUrl;
}
