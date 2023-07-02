package com.anastasiya.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.anastasiya.task1.databinding.FragmentMainBinding
import com.bumptech.glide.Glide
import kotlin.random.Random

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding? = null
    private var adapter: UserAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        initAdapter()
    }
    private fun initAdapter() {
        adapter = UserAdapter(UserRepository.list, Glide.with(this),
            {user -> findNavController().navigate(R.id.action_mainFragment_to_newFragment, createBundle(user))})
        binding?.rvUsers?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    fun createBundle(user: User): Bundle {
        val bundle = Bundle()
        bundle.putInt("ID", user.id)
        return bundle
    }
}
