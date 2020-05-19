package com.banica.market;

//import com.banica.messages.Pong;
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
        //Pong pong = Pong.newBuilder().setId(26).build();
        LOGGER.info("gRPC server started with pong!");
        Server server = NettyServerBuilder.forPort(8080).build();
        server.start();
    }

}
