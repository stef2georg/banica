package com.banica.market;

import com.banica.messages.MessagesApplication;
import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class MarketGrpcServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarketGrpcServer.class);

    @PostConstruct
    public void setup() throws IOException {
        MessagesApplication messagesApplication = new MessagesApplication();
        LOGGER.info("gRPC server started!");
        Server server = NettyServerBuilder.forPort(8080).build();
        server.start();
    }

}
