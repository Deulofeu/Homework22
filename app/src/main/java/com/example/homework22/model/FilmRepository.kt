package com.example.homework22.model

import com.example.homework22.model.models.FilmData

interface FilmRepository {

    fun getFilms(): List<FilmData>
}