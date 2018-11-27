package com.shunya.springbenchmark;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class GreetingHandler {

    private List<TodoItem> todos;

    public GreetingHandler() {
        this.todos = new ArrayList<>();
        todos.add(new TodoItem("Do some stuff", new Date()));
        todos.add(new TodoItem("Do more stuff", new Date()));
        todos.add(new TodoItem("Even more stuff", new Date()));
        todos.add(new TodoItem("Yihaa", new Date()));
        todos.add(new TodoItem("Java is great! Or isn't it?", new Date()));
        todos.add(new TodoItem("Foo Bar", new Date()));
        todos.add(new TodoItem("Lorem ipsum", new Date()));
        todos.add(new TodoItem("Dolor sit amet", new Date()));
    }

	public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello, Spring!"));
	}

    public Mono<ServerResponse> todo(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(todos));
    }
}