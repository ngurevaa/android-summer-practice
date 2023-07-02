package com.anastasiya.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.anastasiya.task1.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {
    private var binding: FragmentMusicBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMusicBinding.bind(view)

        binding?.run{
            music.setOnClickListener {
                findNavController().navigate(R.id.action_musicFragment_to_mainFragment, MainFragment.createBundle("кота, слушающего музыку"))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
