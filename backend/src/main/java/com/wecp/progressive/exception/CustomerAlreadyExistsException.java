// package com.wecp.progressive.exception;

// public class CustomerAlreadyExistsException {
// }


package com.wecp.progressive.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
    public CustomerAlreadyExistsException(String message) {
        super(message);
    }
}