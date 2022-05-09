package com.example.server;

import com.skemaloop.xxx.xxx.XXAABBGrpc;
import com.skemaloop.xxx.xxx.XXAABBOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class XXAABBService extends XXAABBGrpc.XXAABBImplBase {
    @Override
    // Heathcheck
    public void heathcheck(XXAABBOuterClass.HealthcheckRequest request,
    StreamObserver<XXAABBOuterClass.HealthcheckResponse> responseObserver) {
        // PbServiceOuterClass.HelloReply reply = PbServiceOuterClass.HelloReply.newBuilder().setMsg("Msg: Hello," + request.getMsg() + "\n").build();
        XXAABBOuterClass.HealthcheckResponse reply = XXAABBOuterClass.HealthcheckResponse.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    // Helloworld
    public void helloworld(XXAABBOuterClass.HelloRequest request,
    StreamObserver<XXAABBOuterClass.HelloReply> responseObserver) {
        // PbServiceOuterClass.HelloReply reply = PbServiceOuterClass.HelloReply.newBuilder().setMsg("Msg: Hello," + request.getMsg() + "\n").build();
        XXAABBOuterClass.HelloReply reply = XXAABBOuterClass.HelloReply.newBuilder().build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
