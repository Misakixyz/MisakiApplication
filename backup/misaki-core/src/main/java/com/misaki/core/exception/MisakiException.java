package com.misaki.core.exception;
public class MisakiException {
    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public MisakiException(String msg) {
//        super(msg);
        super();
        this.msg = msg;
    }

    public MisakiException(String msg, Throwable e) {
//        super(msg, e);
        super();
        this.msg = msg;
    }

    public MisakiException(String msg, int code) {
//        super(msg);
        super();
        this.msg = msg;
        this.code = code;
    }

    public MisakiException(String msg, int code, Throwable e) {
//        super(msg, e);
        super();
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
