package kr.co.damdaproduct.error.exception;

import kr.co.damdaproduct.error.model.ErrorCode;

public class JwtTokenExpiredException extends BusinessLogicException{
    public JwtTokenExpiredException(ErrorCode errorCode) {
        super(errorCode);
    }
}
