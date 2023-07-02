package com.anastasiya.task1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anastasiya.task1.databinding.ItemUserBinding
import com.bumptech.glide.RequestManager

class UserAdapter(
    private var list: List<User>,
    private val glide: RequestManager,
    private val onItemClick: (User)-> Unit
): RecyclerView.Adapter<UserItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
        UserItem = UserItem(
            binding = ItemUserBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ),
            glide = glide,
            onItemClick = onItemClick
        )

    override fun onBindViewHolder(holder: UserItem, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
