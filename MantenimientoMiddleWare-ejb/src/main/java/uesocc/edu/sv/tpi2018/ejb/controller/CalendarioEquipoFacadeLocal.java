/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.CalendarioEquipo;

/**
 *
 * @author irvin
 */
@Local
public interface CalendarioEquipoFacadeLocal {

    void create(CalendarioEquipo calendarioEquipo);

    void edit(CalendarioEquipo calendarioEquipo);

    void remove(CalendarioEquipo calendarioEquipo);

    CalendarioEquipo find(Object id);

    List<CalendarioEquipo> findAll();

    List<CalendarioEquipo> findRange(int[] range);

    int count();
    
}