package com.jezerm.miproyectofinal.modelo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Producto")
data class Producto(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val cantidadStock: Int,
    val precio: Float,
    val distribuidor: String
)