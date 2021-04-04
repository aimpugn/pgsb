package com.pgsb.application.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.pgsb.repositories.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

class DuplicatedUsernameValidator
    implements ConstraintValidator<DuplicatedUsernameConstraint, String> {

  @Autowired private UserRepository userRepository;

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return (value == null || value.isEmpty()) || !userRepository.findByUsername(value).isPresent();
  }
}
