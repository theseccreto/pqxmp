package com.seccreto.transport.http.h2;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.Map;

public interface Http2Layer {
    void connect(String host, int port, boolean secure) throws Exception;
    void sendData(byte[] data, Map<String, String> headers) throws Exception;
    byte[] receiveData() throws Exception;
    void close() throws Exception;
    boolean isHealthy();
    boolean matches(InputStream input);
}