package com.example.misviajesapp


import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_inicio.*


class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)


    }

    /*fun validate(view: View?) {
        var mailError: String? = null
        if (TextUtils.isEmpty(inicio_edittxt_email.getText())) {
            mailError = getString(R.string.error_email)
        }
        toggleTextInputLayoutError(inicio_txtil_email, mailError)
        var passError: String? = null
        if (TextUtils.isEmpty(inicio_edittxt_pass.getText())) {
            passError = getString(R.string.error_pass)
        }
        toggleTextInputLayoutError(inicio_txtil_pass, passError)
        clearFocus()
    }

    /**
     * Display/hides TextInputLayout error.
     *
     * @param msg the message, or null to hide
     */
    private fun toggleTextInputLayoutError(
        textInputLayout: TextInputLayout,
        msg: String?
    ) {
        textInputLayout.error = msg
        if (msg == null) {
            textInputLayout.isErrorEnabled = false
        } else {
            textInputLayout.isErrorEnabled = true
        }
    }*/

}