package com.example.dm1_202101_cadastroaluno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela3.*

class Tela3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val aluno = intent.getSerializableExtra("aluno") as Aluno

        txtNome.text = aluno.nome
        txtDataNasc.text = aluno.dataNasc
        txtCurso.text = aluno.curso
        txtPeriodo.text = aluno.periodo

        if(aluno.matriculado != null) {
            if (aluno.matriculado!!)
                imgMatricula.setImageResource(R.drawable.ic_check)
            else
                imgMatricula.setImageResource(R.drawable.ic_close)
        }

    }
}
