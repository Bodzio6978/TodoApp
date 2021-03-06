package com.gmail.bodziowaty6978.todoapp.feature_todo.presentation.todos

import com.gmail.bodziowaty6978.todoapp.feature_todo.domain.model.Todo

sealed class TodoEvent {
    data class CompleteTodo(val todo:Todo):TodoEvent()
    data class EditTodo(val todo:Todo):TodoEvent()

}