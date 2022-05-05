package com.example.myapplication.ui.type

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.TypeAdapter
import com.example.myapplication.databinding.TypeFragmentBinding

class TypeFragment : Fragment() {
    private var _binding: TypeFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TypeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.typeRV
        recyclerView.adapter = TypeAdapter(requireContext(), TypeViewModel().loadData())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}