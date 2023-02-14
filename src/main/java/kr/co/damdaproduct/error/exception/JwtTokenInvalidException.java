package kr.co.damdaproduct.error.exception;

import kr.co.damdaproduct.error.model.ErrorCode;

public class JwtTokenInvalidException extends UserDefineException{
    public JwtTokenInvalidException(ErrorCode errorCode){
        super(errorCode);
    }
}