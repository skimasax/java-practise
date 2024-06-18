package com.skima.DTO;


public class DataResponseDTO<T> {
    private boolean status;
    private String message;
    private T data;

    public DataResponseDTO(boolean status, String message, T data) {
        this.status = status;
        this.message=message;
        this.data=data;
    }

    public DataResponseDTO() {
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
