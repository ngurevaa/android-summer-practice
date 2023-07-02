package com.anastasiya.task1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.anastasiya.task1.databinding.FragmentNewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class NewFragment : Fragment(R.layout.fragment_new) {
    private var binding: FragmentNewBinding? = null
    private var options: RequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewBinding.bind(view)

        val id = arguments?.getInt("ID")
        binding?.run {
            val user = UserRepository.list.first{it.id == id}
            tvTitle.text = user.name
            tvDesc.text = user.description
            Glide.with(binding!!.root)
                .load(user.url)
                .apply(options)
                .into(ivImage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
