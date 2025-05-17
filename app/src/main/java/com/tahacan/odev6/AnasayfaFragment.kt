package com.tahacan.odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.tahacan.odev6.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
     private lateinit var binding:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)



        val oyunListesi = ArrayList<Game>()
        val g1 = Game(1,"Fifa","oyun1")
        val g2 = Game(2,"Minecraft","oyun2")
        val g3 = Game(3,"Forza Horizon 5","oyun3")
        val g4 = Game(4,"Call Of Duty Black Ops","oyun4")
        val g5 = Game(5,"Call Of Duty Modern Warfare","oyun5")

        oyunListesi.add(g1)
        oyunListesi.add(g2)
        oyunListesi.add(g3)
        oyunListesi.add(g4)
        oyunListesi.add(g5)




        val gameAdapter = GameAdapter(requireContext(),oyunListesi)
        binding.oyunlarRv.adapter = gameAdapter

        binding.oyunlarRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)

        return binding.root
    }

}
