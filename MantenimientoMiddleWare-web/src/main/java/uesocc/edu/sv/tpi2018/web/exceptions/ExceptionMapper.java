/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.exceptions;

import javax.ws.rs.core.Response;

/**
 *
 * @author danm
 */
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Throwable> {

    public EnumControllerException messages;
    
    @Override
    public Response toResponse(Throwable exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).header("ServerException", exception.getMessage()).build();
    }
    
}