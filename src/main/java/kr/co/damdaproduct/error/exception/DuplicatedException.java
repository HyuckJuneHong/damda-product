package kr.co.damdaproduct.error.exception;

import kr.co.damdaproduct.error.model.ErrorCode;

public class DuplicatedException extends BusinessLogicException{
    public DuplicatedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
