package com.windy;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        System.out.println("Hello World!");
        HttpServer httpServer = vertx.createHttpServer();
        Router router = Router.router(vertx);
        router.route().handler(StaticHandler.create());
        httpServer.requestHandler(router).listen(8080);
    }
}
