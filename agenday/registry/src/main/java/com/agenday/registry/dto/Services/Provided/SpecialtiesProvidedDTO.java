package com.agenday.registry.dto.Services.Provided;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpecialtiesProvidedDTO {
    private String name;
    private List<EmployesProvidedDTO> employes;

}