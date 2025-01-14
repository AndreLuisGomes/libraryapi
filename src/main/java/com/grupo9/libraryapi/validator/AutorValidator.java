package com.grupo9.libraryapi.validadtor;

import com.grupo9.libraryapi.exceptions.RegistroDuplicadoException;
import com.grupo9.libraryapi.model.Autor;
import com.grupo9.libraryapi.repository.AutorRepository;
import org.springframework.stereotype.Component;

@Component
public class AutorValidator {

    private final AutorRepository repository;

    public AutorValidator(AutorRepository repository){
        this.repository = repository;
    }

    public void validar(Autor autor){
        if(existeAutorDuplicado(autor)){
            throw new RegistroDuplicadoException("Autor já cadastrado!");
        }

    }

    public boolean existeAutorDuplicado(Autor autor){
        repository.
    }
}
