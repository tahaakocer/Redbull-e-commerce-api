package com.techtitans.ecommerce.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Banner")
public class Banner {
	@Id
	@Column(name = "banner_id")
	private Integer id;
	
	@Column(name = "url")
	private String url;

}
