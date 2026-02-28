package com.example.virustdserver.mappers;

import org.mapstruct.Mapper;

public interface MapperInterface<T, R>{

    T mapTo(R dto);
    R mapFrom(T entity);
}