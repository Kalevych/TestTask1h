package com.afkoders.testtask1h.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.afkoders.testtask1h.databinding.FragmentSuccessBinding

/**
 * Created by Kalevych Oleksandr on 26.02.2021.
 */

class SuccessFragment : Fragment() {
    private lateinit var binding: FragmentSuccessBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSuccessBinding.inflate(layoutInflater)

        return binding.root
    }


}