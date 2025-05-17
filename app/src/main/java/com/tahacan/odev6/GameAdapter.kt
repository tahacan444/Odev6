package com.tahacan.odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.tahacan.odev6.databinding.ItemGameBinding

class GameAdapter  (var mContext: Context, var oyunListesi: List<Game>)
    : RecyclerView.Adapter<GameAdapter.CardTasarimTutucu>(){

    inner class  CardTasarimTutucu(var tasarim: ItemGameBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        var binding = ItemGameBinding.inflate(LayoutInflater.from(mContext) ,parent,false)
        return  CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return oyunListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val oyun  = oyunListesi.get(position)
        val t = holder.tasarim
        t.imageViewOyun.setImageResource(
            mContext.resources.getIdentifier(oyun.resim,"drawable",mContext.packageName)
        )

        t.cardviewOyun.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.oyunGecis(oyunNesnesi = oyun)
            Navigation.findNavController(it).navigate(gecis)
        }

    }
}