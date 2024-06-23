package com.example.replica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.replica.databinding.FragmentSumaBinding

class Suma : Fragment() {
    lateinit var binding : FragmentSumaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSumaBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtnSuma.setOnClickListener {
            val num1 : Int = binding.TfNum1.editText?.text.toString().toInt()
            val num2 : Int = binding.TfNum2.editText?.text.toString().toInt()
            val resultado : Int = suma(num1, num2)
            binding.TvResultado.text = resultado.toString()
        }
    }

    private fun suma(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}