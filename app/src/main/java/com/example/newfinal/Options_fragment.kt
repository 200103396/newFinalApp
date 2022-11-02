package com.example.newfinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newfinal.databinding.OptionsGenreBinding

class Options_fragment : Fragment(R.layout.options_genre)  {

    lateinit var elements : ArrayList<ListElement>;
    private lateinit var binding: OptionsGenreBinding
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ListAdapter.ItemViewHolder>? = null


//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.cards_element, container, false)
//    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = OptionsGenreBinding.bind(view)
        binding.poGenre.setOnClickListener{
            findNavController().navigate(R.id.action_options_fragment2_to_books_Fragment)
        }

        binding.profil.setOnClickListener {
            findNavController().navigate(R.id.action_options_fragment2_to_personal_fragment)
        }

    }
}