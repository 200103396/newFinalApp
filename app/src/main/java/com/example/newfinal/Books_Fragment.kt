package com.example.newfinal

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newfinal.databinding.CardsElementBinding
import com.example.newfinal.databinding.PageOfBookBinding
import com.example.newfinal.databinding.SignInBinding.bind

class Books_Fragment : Fragment(R.layout.cards_element){
   private lateinit var binding: CardsElementBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = CardsElementBinding.bind(view)
        binding.poka4to.setOnClickListener {
            findNavController().navigate(R.id.action_books_Fragment_to_pageFragment)
        }
    }
}