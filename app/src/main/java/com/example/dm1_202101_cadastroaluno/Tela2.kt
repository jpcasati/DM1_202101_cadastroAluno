package com.example.dm1_202101_cadastroaluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        btnFinalizar.setOnClickListener {

            val aluno = intent.getSerializableExtra("aluno") as Aluno

            aluno.curso = edtCurso.text.toString()
            aluno.periodo = edtPeriodo.text.toString()

            if(swtMatriculado.isChecked)
                aluno.matriculado = true
            else
                aluno.matriculado = false

            val i = Intent(this, Tela3::class.java)

            i.putExtra("aluno", aluno)

            startActivity(i)

        }

    }
}
