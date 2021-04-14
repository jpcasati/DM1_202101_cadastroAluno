package com.example.dm1_202101_cadastroaluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.menuLimpar -> {
                edtNome.text.clear()
                edtDataNasc.text.clear()
                edtNome.requestFocus()
            }
            R.id.menuHora -> {
                val horaAtual = SimpleDateFormat("HH:mm:ss").format(Date())
                Toast.makeText(this, horaAtual, Toast.LENGTH_SHORT).show()
            }
            R.id.menuFechar -> finish()
            else -> Toast.makeText(this, "Ação não programada", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Utilize o menu para fechar", Toast.LENGTH_SHORT).show()
    }
}