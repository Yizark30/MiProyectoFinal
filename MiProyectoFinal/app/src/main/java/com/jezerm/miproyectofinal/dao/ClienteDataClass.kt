package com.jezerm.miproyectofinal.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jezerm.miproyectofinal.modelo.Cliente

@Database(entities = [Cliente::class], version = 1)
abstract class ClienteDataClass : RoomDatabase() {
    //Creamos un método abstracto para obtener un objeto Dao de la entidad de Estudiante
    abstract fun estudianteDao(): ClienteDao
}