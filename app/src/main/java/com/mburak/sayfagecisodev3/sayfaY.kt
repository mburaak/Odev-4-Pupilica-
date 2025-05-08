package com.mburak.sayfagecisodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.mburak.sayfagecisodev3.databinding.FragmentSayfaYBinding

class sayfaY : Fragment() {
    private lateinit var binding:FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle? ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Navigation.findNavController(binding.textView).navigate(R.id.gecisAnasayfa)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)

        return binding.root

    }

}