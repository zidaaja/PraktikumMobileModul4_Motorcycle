package com.example.myapplication.ui.accessories

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.AccessoriesAdapter
import com.example.myapplication.databinding.AccessoriesFragmentBinding

class AccessoriesFragment : Fragment() {

    private var _binding : AccessoriesFragmentBinding? = null

    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AccessoriesFragmentBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.accessoriesRV
        recyclerView.adapter = AccessoriesAdapter(requireContext(), AccessoriesViewModel().loadData())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}