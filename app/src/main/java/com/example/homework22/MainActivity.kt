package com.example.homework22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework22.model.Server
import com.example.homework22.model.models.FilmData
import com.example.homework22.presenter.FilmPresenter
import com.example.homework22.presenter.FilmPresenterImpl
import com.example.homework22.ui.FilmAdapter
import com.example.homework22.ui.FilmFragment
import com.example.homework22.ui.FilmsView


class MainActivity : AppCompatActivity(), FilmsView {

    private var presenter: FilmPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = FilmPresenterImpl(this)
        presenter?.getFilms()

    }

    override fun showFilms(film: List<FilmData>) {
        val filmList = Server.getFilms()
        val adapter = FilmAdapter()
        val recycler = findViewById<RecyclerView>(R.id.rvFilms)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, FilmFragment())
                .commit()
        recycler?.adapter = adapter
        recycler?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adapter.setItems(filmList)
    }
}