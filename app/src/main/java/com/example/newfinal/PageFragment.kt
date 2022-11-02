package com.example.newfinal

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.PopupMenu
import androidx.core.widget.PopupMenuCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newfinal.databinding.PageOfBookBinding

class PageFragment: Fragment(R.layout.page_of_book) {
private lateinit var binding: PageOfBookBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = PageOfBookBinding.bind(view)
//        binding.whatSelect.setOnClickListener {
//            val pp = PopupMenu(findNavController().context, it)
//            pp.setOnMenuItemClickListener {item -> }
//        }
    }
}