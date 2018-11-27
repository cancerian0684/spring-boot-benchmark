package com.shunya.springbenchmark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/todo/list")
public class TodoResource {
    private List<TodoItem> todos;

    public TodoResource() {
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

    @GetMapping
    public List<TodoItem> getAll() {
        return todos;
    }

}
