package io.github.majusko.pulsar.error.exception;

import java.io.IOException;

public class ClientInitException extends IOException {
    public ClientInitException(String message) {
        super(message);
    }
}
