package com.afkoders.testtask1h.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.afkoders.testtask1h.R
import com.afkoders.testtask1h.databinding.FragmentSignupBinding
import com.afkoders.testtask1h.viewmodel.SignupViewModel

/**
 * Created by Kalevych Oleksandr on 26.02.2021.
 */

class SignupFragment : Fragment() {

    private val viewModel: SignupViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onActivityCreated()"
        }
        ViewModelProvider(this, SignupViewModel.Factory(activity.application))
            .get(SignupViewModel::class.java)
    }

    private lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSignupBinding.inflate(layoutInflater)

        val btnApply = binding.root.findViewById<Button>(R.id.btn_signup)
        val etUsername = binding.root.findViewById<EditText>(R.id.et_username)
        val etMail = binding.root.findViewById<EditText>(R.id.et_mail)

        btnApply.setOnClickListener {
            viewModel.signupUser(etUsername.text.toString(), etMail.text.toString())
        }

        viewModel.currentUser.observe(viewLifecycleOwner, {
            if(it.username.isNotBlank()) {
                findNavController().navigate(R.id.fragmentSignup_to_fragmentSuccess)
            }
        })

        return binding.root
    }

}