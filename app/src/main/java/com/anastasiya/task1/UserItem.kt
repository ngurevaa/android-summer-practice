package com.anastasiya.task1

import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.anastasiya.task1.databinding.ItemUserBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class UserItem(
    private val binding: ItemUserBinding,
    private val glide: RequestManager,
    private val onItemClick: (User) -> Unit
): ViewHolder(binding.root) {
    private val options: RequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)

    fun onBind(user: User) {
        binding?.run {
            tvTitle.text = user.name
            tvDesc.text = user.description

            glide.load(user.url)
                .apply(options)
                .into(ivImage)

            root.setOnClickListener {
                onItemClick(user)
            }
        }
    }
}
