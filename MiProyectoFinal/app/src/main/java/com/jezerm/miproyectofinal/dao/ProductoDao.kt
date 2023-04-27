package com.jezerm.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.jezerm.miproyectofinal.modelo.Producto

@Dao
interface ProductoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(Producto: Producto): Long

    @Update
    fun actualizar(Producto: Producto): Int

    @Delete
    fun eliminar(Producto: Producto): Int

    @Query("SELECT * FROM Producto")
    fun obtenerTodos(): LiveData<List<Producto>>
}