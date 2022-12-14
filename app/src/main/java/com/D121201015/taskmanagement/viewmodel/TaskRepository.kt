package com.D121201015.taskmanagement.viewmodel

import androidx.lifecycle.LiveData
import com.D121201015.taskmanagement.db.TaskDao
import com.D121201015.taskmanagement.model.TodoModel

class TaskRepository(private val taskDao: TaskDao) {
    val allTask: LiveData<List<TodoModel>> = taskDao.getTask()

    suspend fun insert(task: TodoModel) {
        taskDao.insertTask(task)
    }
}