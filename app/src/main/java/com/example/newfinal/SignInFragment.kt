package com.example.newfinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newfinal.databinding.SignInBinding

class SignInFragment: Fragment(R.layout.sign_in) {

    private lateinit var binding: SignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SignInBinding.bind(view)
        binding.signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_options_fragment2)
        }
        binding.signUpInsideIn.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_sign_Up2)
        }
    }
}