package com.carde.carde.util;

import com.carde.carde.exceptios.CardeExceptions;
import com.carde.carde.model.Response;

public class CardeUtils {
	
	public static void catchResponse(Response<?> response, Exception e) {
		response.setResultset(null);
		 if (e instanceof CardeExceptions) {
			response.setStatuscode(((CardeExceptions) e).getStatusCode());
			response.setStatusmessage(((CardeExceptions) e).getMessage());
		} else { // Errores internos
			response.setStatuscode(Constantes.CODIGO_ERROR_PROCESO);
			response.setStatusmessage(Constantes.MENSAJE_ERROR_PROCESO);
		}
	}

}
