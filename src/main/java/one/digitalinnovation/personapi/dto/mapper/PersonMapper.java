package one.digitalinnovation.personapi.dto.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;


public interface PersonMapper {


    PersonDTO toDTO(Person dto);

    Person toModel(PersonDTO personDTO);
}