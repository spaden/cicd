package com.webappbasic.springboot.webappbasic.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public static List<ToDo> todos = new ArrayList<ToDo>();
    public static int todoCount = 2;

    static {
        todos.add(new ToDo(1, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(1, "in28minutes", "Learn Android", LocalDate.now().plusMonths(1), false));
    }

    public static void addTodos(String description) {
        todoCount++;
        todos.add(new ToDo(todoCount, "in28minutes", description, LocalDate.now().plusYears(1), false));
        System.out.println(todos);
    }

}
