package com.example.server;

import com.skemaloop.xxx.xxx.TTXXBBGrpc;
import com.skemaloop.xxx.xxx.TTXXBBOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TTXXBBService extends TTXXBBGrpc.TTXXBBImplBase {
    @Override
    // Heathcheck
    public void heathcheck(TTXXBBOuterClass.HealthcheckRequest request,
    StreamObserver<TTXXBBOuterClass.HealthcheckResponse> responseObserver) {
        // PbServiceOuterClass.HelloReply reply = PbServiceOuterClass.HelloReply.newBuilder().setMsg("Msg: Hello," + request.getMsg() + "\n").build();
        TTXXBBOuterClass.HealthcheckResponse reply = TTXXBBOuterClass.HealthcheckResponse.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    // Helloworld
    public void helloworld(TTXXBBOuterClass.HelloRequest request,
    StreamObserver<TTXXBBOuterClass.HelloReply> responseObserver) {
        // PbServiceOuterClass.HelloReply reply = PbServiceOuterClass.HelloReply.newBuilder().setMsg("Msg: Hello," + request.getMsg() + "\n").build();
        TTXXBBOuterClass.HelloReply reply = TTXXBBOuterClass.HelloReply.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
