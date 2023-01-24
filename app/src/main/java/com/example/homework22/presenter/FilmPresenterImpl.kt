package com.example.homework22.presenter

import com.example.homework22.model.FilmRepository
import com.example.homework22.model.Server
import com.example.homework22.ui.FilmsView

class FilmPresenterImpl(private var view: FilmsView?) : FilmPresenter {

    private val repository: FilmRepository = Server

    override fun getFilms() {
        val films = repository.getFilms()
        view?.showFilms(films)
    }

    override fun onClear() {
        view = null
    }
}