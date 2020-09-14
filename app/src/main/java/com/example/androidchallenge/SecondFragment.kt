package com.example.androidchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.view.*

private const val NAME = "param1"
private const val EMAIL = "param2"
private const val PHONE = "param3"
class SecondFragment : Fragment() {
   private var name:String? = null

    private var email:String? = null

    private var phone:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME)
            email = it.getString(EMAIL)
            phone = it.getString(PHONE)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        view.text_view_name.text = name
        view.text_view_email.text = email
        view.text_view_phone.text = phone
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2:String, param3:String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME, param1)
                    putString(EMAIL, param2)
                    putString(PHONE, param3)
                }
            }
    }
}