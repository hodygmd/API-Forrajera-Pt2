package com.gmdhody.apiforrajerapt2.dto;

import lombok.Data;

@Data
public class EmpleadoDto {
    private String clave;
    private String nombre;
    private Integer id_puesto;
    private Byte status;
}