package com.example.MFuadi

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.annotation.SuppressLint
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // membuat tombol aksi ketika button diklik
        val tombolAksi: Button = findViewById(R.id.buttonGanti)
        tombolAksi.setOnClickListener {
            ubahAngka()
        }
    }
    //fungsi ketika tombol di klik akan di panggil fungsi ini
    private fun ubahAngka(){

        //mengubah isi textbox
        val txtHello: TextView = findViewById(R.id.txtdadu1)
        val image1: ImageView = findViewById(R.id.imageView1)
        isiGambar(txtHello,image1)

        val txtDadu2: TextView = findViewById(R.id.txtdadu2)
        val image2: ImageView = findViewById(R.id.imageView2)
        isiGambar(txtDadu2,image2)


        val txtDadu3: TextView = findViewById(R.id.txtdadu3)
        val image3: ImageView = findViewById(R.id.imageView3)
        isiGambar(txtDadu3,image3)

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun isiGambar(txtHello: TextView, image1: ImageView){
        val tes = (1 until 6).random()
        txtHello.text = tes.toString()

        when (tes) {
            1 -> image1.setImageDrawable(getDrawable(R.drawable.gmr1))
            2 -> image1.setImageDrawable(getDrawable(R.drawable.gmr2))
            3 -> image1.setImageDrawable(getDrawable(R.drawable.gmr3))
            4 -> image1.setImageDrawable(getDrawable(R.drawable.gmr4))
            5 -> image1.setImageDrawable(getDrawable(R.drawable.gmr5))
            else -> { // Note the block
                image1.setImageDrawable(getDrawable(R.drawable.gmr6))
            }
        }
    }

    fun pindahPage(view:View){
        val intent = Intent(this, ListMovie::class.java).apply {
            // putExtra(, message)
        }
        startActivity(intent)
    }


}