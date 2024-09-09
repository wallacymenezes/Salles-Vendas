package com.projects.sallesregister.dto;

import com.projects.sallesregister.services.validation.UserInsertValid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@UserInsertValid
public class UserInsertDTO extends UserDTO{
	
	@NotBlank(message = "Campo obrigatório")
	@Size(min = 8, message = "Deve conter no mínimo 8 caracteres")
	private String password;

	public UserInsertDTO() {
		super();
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}