package com.cursosant.fragmentnavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast


class FragmentSettings : Fragment(R.layout.fragment_settings) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val saludo = arguments?.getString("usuario")
        Toast.makeText(requireContext(), saludo, Toast.LENGTH_SHORT).show()

    }
}