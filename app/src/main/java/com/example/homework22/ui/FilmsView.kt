package com.example.homework22.ui

import com.example.homework22.model.models.FilmData

interface FilmsView {

    fun showFilms(film: List<FilmData>)

}