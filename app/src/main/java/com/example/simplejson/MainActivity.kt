package com.example.simplejson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    lateinit var txtemail: TextView
    lateinit var txtfirstname: TextView
    lateinit var txtlastname: TextView
    var jsonString = "{\"data\":{\"id\":1,\"email\":\"george.bluth@reqres.in\",\"first_name\":\"George\",\"last_name\":\"Bluth\",\"avatar\":\"https://reqres.in/img/faces/1-image.jpg\"},{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://reqres.in/img/faces/2-image.jpg\"},{\"id\":3,\"email\":\"emma.wong@reqres.in\",\"first_name\":\"Emma\",\"last_name\":\"Wong\",\"avatar\":\"https://reqres.in/img/faces/3-image.jpg\"},{\"id\":4,\"email\":\"eve.holt@reqres.in\",\"first_name\":\"Eve\",\"last_name\":\"Holt\",\"avatar\":\"https://reqres.in/img/faces/4-image.jpg\"},{\"id\":5,\"email\":\"charles.morris@reqres.in\",\"first_name\":\"Charles\",\"last_name\":\"Morris\",\"avatar\":\"https://reqres.in/img/faces/5-image.jpg\"},{\"id\":6,\"email\":\"tracey.ramos@reqres.in\",\"first_name\":\"Tracey\",\"last_name\":\"Ramos\",\"avatar\":\"https://reqres.in/img/faces/6-image.jpg\"}}"
  lateinit var email:String
  lateinit var firstname:String
  lateinit var lastname:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
       txtemail=findViewById(R.id.txtemail)
        txtfirstname=findViewById(R.id.txtfirstName)
        txtlastname=findViewById(R.id.txtlastname)
        try {

            val obj = JSONObject(jsonString)

            val data: JSONObject = obj.getJSONObject("data")

            email = data.getString("name")
            firstname = data.getString("salary")
            lastname=data.getString("lastname")
            val textView=findViewById<TextView>(R.id.txtemail).apply {
                text=email
            }
            val textView1=findViewById<TextView>(R.id.txtfirstName).apply {
                text=firstname
            }
            val textView3=findViewById<TextView>(R.id.txtlastname).apply {
                text=lastname
            }



        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }
}

