package com.D121201015.taskmanagement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.D121201015.taskmanagement.model.TodoModel
import kotlinx.android.synthetic.main.item_todo.view.*

class TaskAdapter(private val list: List<TodoModel>) : RecyclerView.Adapter<TaskAdapter.TodoViewHolder>() {

    // 3 functions of the view holder
    // 1st func
    // In this Layout inflatter is called which converts view in such a form that adapter can consume it
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_todo, parent, false)
        )
    }


    override fun getItemCount() = list.size
    
    // 2nd func
    // this will set data in each card
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(list[position]) // we are passing the object of the list that we made in the ToDoModel.kt
    }

    // 3rd func
    override fun getItemId(position: Int): Long {
        return list[position].id
    }

    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(taskModel: TodoModel) {
            with(itemView) {
                txtShowTitle.text = taskModel.title
                txtShowTask.text = taskModel.description
                txtShowCategory.text = taskModel.category
            }
        }
    }

}


