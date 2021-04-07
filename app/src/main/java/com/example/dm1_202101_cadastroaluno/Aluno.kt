package com.example.dm1_202101_cadastroaluno

import java.io.Serializable

data class Aluno(
                var nome: String,
                var dataNasc: String,
                var curso: String?,
                var periodo: String?,
                var matriculado: Boolean?
                ) : Serializable {
}