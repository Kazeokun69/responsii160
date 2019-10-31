package com.example.responsi160

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class Home : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        listView = findViewById(R.id.ListView)
        var list = mutableListOf<Model>()

        list.add(Model("Facebook",   "Sebuah aplikasi sosilal media yang di ciptakan oleh Zuck",   R.drawable.facebook  ))
        list.add(Model("Twitter",   "Sebuah aplikasi sosial media yang di ciptakan oleh Jack Dorsey",   R.drawable.twitter  ))
        list.add(Model("Youtube", "Aplikasi yang berguna untuk melihat video online", R.drawable.youtube  ))
        list.add(Model("Instagram",  "Sebuah aplikasi sosial media untuk yang di dalamnya hanya membagikan gambar dan video",  R.drawable.instagram  ))
        list.add(Model("WhatsApp",  "Sebuah aplikasi chatting yang sangat banyak di gunakan",  R.drawable.whatsapp  ))
        list.add(Model("Spotify",  "Aplikasi untuk mendengarkan music secara online",  R.drawable.spotify  ))
        list.add(Model("Line",  "Sebuah aplikasi chatting yang di kembangkan di negara korea",  R.drawable.line  ))
        list.add(Model("Wattpad",  "Tempat untuk membaca novel online",  R.drawable.wattpad  ))
        list.add(Model("Traveloka",  "Aplikasi booking online untuk berpergian",  R.drawable.traveloka  ))
        list.add(Model("Pinteres",  "Aplikasi yang berisi gambar gambar ",  R.drawable.pinteres  ))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@Home, "Item Satu",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@Home, "Item Dua",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@Home, "Item Tiga", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@Home, "Item Empat",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@Home, "Item Lima",  Toast.LENGTH_SHORT).show()
            }
            if (position==5){
                Toast.makeText(this@Home, "Item Enam",  Toast.LENGTH_SHORT).show()
            }
            if (position==6){
                Toast.makeText(this@Home, "Item Tujuh",  Toast.LENGTH_SHORT).show()
            }
            if (position==7){
                Toast.makeText(this@Home, "Item Delapan",  Toast.LENGTH_SHORT).show()
            }
            if (position==8){
                Toast.makeText(this@Home, "Item Sembilan",  Toast.LENGTH_SHORT).show()
            }
            if (position==9){
                Toast.makeText(this@Home, "Item Sepuluh",  Toast.LENGTH_SHORT).show()
            }
        }
    }

}
