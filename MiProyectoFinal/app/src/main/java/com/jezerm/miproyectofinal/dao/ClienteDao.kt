package com.jezerm.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.jezerm.miproyectofinal.modelo.Distribuidor
import com.jezerm.miproyectofinal.modelo.Producto

@Dao
interface ClienteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(Distribuidor: Distribuidor): Long

    @Update
    fun actualizar(Distribuidor: Distribuidor): Int

    @Delete
    fun eliminar(Distribuidor: Distribuidor): Int

    @Query("SELECT * FROM Distribuidor")
    fun obtenerTodos(): LiveData<List<Distribuidor>>
}