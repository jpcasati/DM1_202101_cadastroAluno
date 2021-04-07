package com.example.dm1_202101_cadastroaluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProxima.setOnClickListener {

            val aluno = Aluno(
                edtNome.text.toString(),
                edtDataNasc.text.toString(),
                null,
                null,
                null
            )

            val i = Intent(this, Tela2::class.java)

            i.putExtra("aluno", aluno)

            startActivity(i)

        }
    }
}