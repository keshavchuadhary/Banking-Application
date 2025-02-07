package com.musdon.the_java_bank;

import java.math.*;
import java.time.*;

import org.hibernate.annotations.*;

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
class User {
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
	private String laternativePhoneNumber;
	private String status;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime modifiedAt;

}
