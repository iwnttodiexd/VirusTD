package com.example.virustdserver.mappers;

public interface MapperInterface<T, R> {

    T mapFromDto (R dto);

    R mapToDto(T entity);
}
