package com.deasdaniel.movies2022.ui.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.deasdaniel.movies2022.databinding.FragmentListBinding

class listFragment : Fragment() {

    private lateinit var listViewModel: ListViewModel
    private lateinit var listBinding: FragmentListBinding
    private lateinit var moviesAdapter: MoviesAdapter
    private var moviesList: ArrayList<Movie> = ArrayList()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        listBinding = FragmentListBinding.inflate(inflater, container, false)
        listViewModel = ViewModelProvider(this)[ListViewModel::class.java]
        return listBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moviesAdapter = MoviesAdapter(moviesList, onItemClicked = { onMovieItemClicked(it)} )

        listBinding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@listFragment.requireContext())
            adapter = moviesAdapter
            setHasFixedSize(false)
        }

        listViewModel.getMovies()
    }

    private fun onMovieItemClicked(it: Movie) {


    }

}