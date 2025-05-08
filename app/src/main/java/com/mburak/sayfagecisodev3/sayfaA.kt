package com.mburak.sayfagecisodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mburak.sayfagecisodev3.databinding.FragmentSayfaABinding

class sayfaA : Fragment() {
    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisB)
        }

        return binding.root
    }
}