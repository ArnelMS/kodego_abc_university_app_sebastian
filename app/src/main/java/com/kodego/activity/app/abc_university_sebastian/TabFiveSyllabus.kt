package com.kodego.activity.app.abc_university_sebastian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kodego.activity.app.abc_university_sebastian.databinding.FragmentTabFiveSyllabusBinding

class TabFiveSyllabus : Fragment() {

    lateinit var binding: FragmentTabFiveSyllabusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabFiveSyllabusBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
}