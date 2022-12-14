package com.D121201015.taskmanagement.viewmodel

import android.app.Application
import com.D121201015.taskmanagement.db.AppDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class TasksApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { TaskRepository(database.todoDao()) }
}