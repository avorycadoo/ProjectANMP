package com.ievana.capygo_anmp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ievana.capygo_anmp.databinding.FragmentAchievementBinding
import com.ievana.capygo_anmp.databinding.FragmentTeamMemberBinding

class AchievementFragment : Fragment() {
   private lateinit var binding: FragmentAchievementBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAchievementBinding.inflate(inflater, container, false)
        return binding.root
    }

}