package ro.tpjad.entity;

public class JsonEntityResponse {

	private Boolean success;
	private String errorMessage;
	private Object data;

	public JsonEntityResponse(Boolean success) {
		this.success = success;
	}

	public JsonEntityResponse(Boolean success, String errorMessage) {
		this.success = success;
		this.errorMessage = errorMessage;
	}

	public JsonEntityResponse(Boolean success, String errorMessage, Object data) {
		super();
		this.success = success;
		this.errorMessage = errorMessage;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public JsonEntityResponse() {
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
