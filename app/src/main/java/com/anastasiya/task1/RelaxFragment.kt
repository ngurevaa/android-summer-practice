package com.anastasiya.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.anastasiya.task1.databinding.FragmentRelaxBinding


class RelaxFragment : Fragment(R.layout.fragment_relax) {
    private var binding: FragmentRelaxBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRelaxBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
