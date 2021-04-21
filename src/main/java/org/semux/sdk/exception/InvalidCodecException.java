/**
 * Copyright (c) 2021 The Semux Developers
 * <p>
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.semux.sdk.exception;

public class InvalidCodecException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidCodecException() {
    }

    public InvalidCodecException(String s) {
        super(s);
    }

    public InvalidCodecException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public InvalidCodecException(Throwable throwable) {
        super(throwable);
    }

    public InvalidCodecException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
