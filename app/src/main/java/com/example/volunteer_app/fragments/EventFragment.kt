package com.example.volunteer_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.volunteer_app.R
import com.example.volunteer_app.databinding.FragmentEventsBinding

class EventFragment: Fragment(R.layout.fragment_events) {
    private lateinit var binding: FragmentEventsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

}