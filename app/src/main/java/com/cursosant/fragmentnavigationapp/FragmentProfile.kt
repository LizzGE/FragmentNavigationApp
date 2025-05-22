package com.cursosant.fragmentnavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.Toast

class FragmentProfile : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nombreRecibido = arguments?.getString("nombre")

        Toast.makeText(requireContext(), "Hola, $nombreRecibido Bienvenido", Toast.LENGTH_SHORT).show()

        view.findViewById<Button>(R.id.btn_settings).setOnClickListener {
            val bundle = Bundle()
            bundle.putString("usuario", "Bienvenido, $nombreRecibido")

            val settingsFragment = FragmentSettings()
            settingsFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, settingsFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}