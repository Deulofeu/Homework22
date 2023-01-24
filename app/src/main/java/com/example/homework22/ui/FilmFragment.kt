package com.example.homework22.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.homework22.R

class FilmFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_films, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tvName).text = arguments?.getString(NAME)
        view.findViewById<TextView>(R.id.tvDesc).text = arguments?.getString(KEY)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    companion object {
        private val KEY = "key"
        private val NAME = "text"
    }

    fun newInstance(name: String, text: String): FilmFragment {
        val fragment = FilmFragment()
        val args: Bundle = Bundle()
        args.putString(KEY, text)
        args.putString(NAME, name)
        fragment.arguments = args
        return fragment
    }
}