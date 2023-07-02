package com.anastasiya.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.anastasiya.task1.databinding.FragmentCatBinding

class CatFragment : Fragment(R.layout.fragment_cat) {
    private var binding: FragmentCatBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCatBinding.bind(view)

        binding?.run{
            cat.setOnClickListener {
                findNavController().navigate(R.id.action_catFragment_to_mainFragment,
                    MainFragment.createBundle("барсика"))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
