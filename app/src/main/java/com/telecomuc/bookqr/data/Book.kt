package com.telecomuc.bookqr.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

data class BookResponse(

        @Json(name = "code")
        val code: Int,

        @Json(name = "message")
        val message: String?,

        @Json(name = "response")
        val response: BookData?
)

@Entity(tableName = "book_data",
        primaryKeys = ["id"],
        indices = [Index("id", unique = true)])
@Parcelize
data class BookData(

        @Json(name = "id")
        val id: Long,

        @Json(name = "tipo")
        val tipo: String?,

        @Json(name = "asignatura")
        val asignatura: String?,

        @Json(name = "nombre")
        val nombre: String?,

        @Json(name = "autor")
        val autor: String?,

        @Json(name = "editorial")
        val editorial: String?,

        @Json(name = "codigo")
        val codigo: String?,

        @Json(name = "status")
        val status: Int,

        var requestDate: String?
) : Parcelable