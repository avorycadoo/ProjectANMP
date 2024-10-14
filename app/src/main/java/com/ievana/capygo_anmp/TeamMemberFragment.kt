package com.ievana.capygo_anmp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ievana.capygo_anmp.databinding.FragmentMainBinding
import com.ievana.capygo_anmp.databinding.FragmentTeamMemberBinding

class TeamMemberFragment : Fragment() {


 private lateinit var binding: FragmentTeamMemberBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeamMemberBinding.inflate(inflater, container, false)
        return binding.root
    }


}