// package com.wecp.progressive.exception;

// public class AccountNotFoundException {
// }
package com.wecp.progressive.exception;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}