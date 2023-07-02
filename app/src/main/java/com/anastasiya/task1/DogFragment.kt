package com.anastasiya.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.anastasiya.task1.databinding.FragmentDogBinding


class DogFragment : Fragment(R.layout.fragment_dog) {
    private var binding: FragmentDogBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDogBinding.bind(view)

        binding?.run{
            dog.setOnClickListener {
                findNavController().navigate(R.id.action_dogFragment_to_mainFragment,
                    MainFragment.createBundle("леди"))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
