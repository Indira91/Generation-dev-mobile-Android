package com.generation.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generation.todolist.databinding.FragmentListBinding
import com.generation.todolist.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Ler um livro motivacional",
                "Ler 2 horas por dia",
                "Indira",
                "2022-06-20",
                false,
                "Todos os dias"

            ),
            Tarefa(
                "Fazer curso de programação",
                "Pelo menos 15h por semana",
                "Indira",
                "2022-04-05",
                true,
                "3 vezes por semana"

            ),
            Tarefa(
                "Fazer atividade fisica",
                "Qualquer tipo de atividade ao ar livre",
                "Indira",
                "2022-01-01",
                true,
                "Diariamente"
            )
        )

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }

}