package com.example.navigation_architecture_component

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_registration.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_registrationFragment)
        )

        button_login.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
        }
    }
}
