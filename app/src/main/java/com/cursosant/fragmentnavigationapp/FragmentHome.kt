package com.cursosant.fragmentnavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.EditText
import android.widget.Button


class FragmentHome : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_enviar).setOnClickListener {
            val name = view.findViewById<EditText>(R.id.etx_name).text.toString()


            val bundle = Bundle()
            bundle.putString("nombre", name)

            val profileFragment = FragmentProfile()
            profileFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,profileFragment)
                .addToBackStack("Hola")
                .commit()
        }

        view.findViewById<Button>(R.id.btn_enviar).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentProfile())
                .addToBackStack(null)
                .commit()
        }

        view.findViewById<Button>(R.id.btn_settings).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentSettings())
                .addToBackStack(null)
                .commit()
        }

        }

    }

