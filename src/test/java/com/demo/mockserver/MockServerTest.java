package com.demo.mockserver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;

import static org.junit.jupiter.api.Assertions.*;

class MockServerTest {

    private ClientAndServer mockServer;

    @BeforeEach
    void startServer() {
        this.mockServer = ClientAndServer.startClientAndServer(1080);
    }

    @AfterEach
    void stopServer() {
        this.mockServer.stop();
    }

    @Test
    void test(){

    }
}
