package com.musdon.the_java_bank;

import java.math.*;
import java.time.*;

import org.hibernate.annotations.*;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String otherName;
	private String address;
	private String stateOfOrigin;
	private String AccountNumber;
	private BigDecimal accountBalance;
	private String email;
	private String phoneNumber;
	private String alternativePhoneNumber;
	private String status;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime modifiedAt;

}
