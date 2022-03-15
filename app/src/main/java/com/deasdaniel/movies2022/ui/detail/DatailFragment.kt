package com.deasdaniel.movies2022.ui.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.deasdaniel.movies2022.R

class DatailFragment : Fragment() {

    companion object {
        fun newInstance() = DatailFragment()
    }

    private lateinit var viewModel: DatailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_datail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DatailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}