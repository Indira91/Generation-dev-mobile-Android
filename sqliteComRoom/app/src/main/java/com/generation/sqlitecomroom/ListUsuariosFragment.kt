package com.generation.sqlitecomroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generation.sqlitecomroom.databinding.FragmentListUsuariosBinding

class ListUsuariosFragment : Fragment() {

    private lateinit var binding: FragmentListUsuariosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListUsuariosBinding.inflate(layoutInflater, container, false)
        
        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listUsuariosFragment_to_createUsuarioFragment)
        }
        return binding.root
    }

}