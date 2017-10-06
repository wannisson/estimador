package br.com.gerencial.project.exception;

import static br.com.gerencial.project.exception.ExceptionConstants.SERVER_EXCEPTION;

public class ServerException extends GenericException {

	private static final long serialVersionUID = 201608020138L;

	public ServerException(String error) {
		super(ExceptionConstants.SERVER_EXCEPTION);
		getExceptionBean().setMessage(String.format(SERVER_EXCEPTION.getMessage(), error));
	}

}
