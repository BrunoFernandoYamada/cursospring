package com.bfyamada.cursomc.services.validations;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bfyamada.cursomc.dto.ClienteNewDTO;
import com.bfyamada.cursomc.resources.handlers.FieldMessage;
public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
 @Override
 public void initialize(ClienteInsert ann) {
 }
 @Override
 public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {
 List<FieldMessage> list = new ArrayList<>();

 // inclua os testes aqui, inserindo erros na lista

 for (FieldMessage e : list) {
	 context.disableDefaultConstraintViolation();
	 context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
	 .addConstraintViolation();
 }
 return list.isEmpty();
 }
}