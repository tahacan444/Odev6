package com.tahacan.odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.tahacan.odev6.databinding.FragmentOyunBinding


class OyunFragment : Fragment() {
   private lateinit var binding:FragmentOyunBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOyunBinding.inflate(inflater, container, false)

        val bundle:OyunFragmentArgs by navArgs()
        val oyun = bundle.oyunNesnesi

        binding.toolbarOyun.title = oyun.ad

        binding.ivOyun.setImageResource(
            resources.getIdentifier(oyun.resim,"drawable",requireContext().packageName)
        )

        return binding.root

    }

    }