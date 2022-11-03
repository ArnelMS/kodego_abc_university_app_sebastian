package com.kodego.activity.app.abc_university_sebastian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kodego.activity.app.abc_university_sebastian.databinding.FragmentTabFourNotesBinding

class TabFourNotes : Fragment() {

    lateinit var binding : FragmentTabFourNotesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabFourNotesBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
}