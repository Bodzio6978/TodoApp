package com.gmail.bodziowaty6978.todoapp.feature_todo.domain.use_case

import com.gmail.bodziowaty6978.todoapp.feature_todo.domain.repository.TodoRepository
import com.gmail.bodziowaty6978.todoapp.feature_todo.domain.model.Todo

class UpdateTodo(
    private val repository: TodoRepository
){

    suspend operator fun invoke(todo: Todo){
        repository.updateTodoItem(todo)
    }
}