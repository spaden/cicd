package com.webappbasic.springboot.webappbasic.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class ToDoController {

    @RequestMapping("list-todos")
    public String listAllTodos() {
        return "listTodos";
    }


    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    @ResponseBody
    public String returnMessage(@RequestParam String description, ModelMap model) {
        TodoService.addTodos(description);
        return "OKAY";
    }
}
