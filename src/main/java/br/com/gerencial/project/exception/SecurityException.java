package br.com.gerencial.project.exception;

public class SecurityException extends GenericException {

	private static final long serialVersionUID = 201606062325L;

	public SecurityException() {
		super(ExceptionConstants.SECURITY_EXCEPTION);
	}

}
