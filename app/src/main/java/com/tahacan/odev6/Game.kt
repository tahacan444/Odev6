package com.tahacan.odev6

import java.io.Serializable


data class Game(var id:Int,
                var ad:String,
                var resim:String) : Serializable {
}