package com.training.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="suppliers")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Column
	private int supplierId;
	
	@Column
	@NotBlank(message="Supplier Name is Mandatory")
	private String supplierName;
	
	@JoinColumn(referencedColumnName ="id",nullable=false)
	@ManyToOne(cascade = CascadeType.PERSIST)

	private City city;
	
	@JoinColumn(referencedColumnName="id",nullable=false)
	@OneToOne(cascade = CascadeType.ALL)
	
	private Contact contact;
}
