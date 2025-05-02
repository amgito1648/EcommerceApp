package com.cristiancala.ecommerceapp

import android.util.Patterns
import java.util.regex.Pattern

//retornar True si es valido o False si es invalido
//tambien retorne una cadena de texto que me diga que paso si no es valido

fun validateEmail(email: String): Pair<Boolean, String>{
    return when{
        email.isEmpty()->Pair(false, "El correo es requerido")
        !Patterns.EMAIL_ADDRESS.matcher(email).matches()-> Pair(false, "El correo es invalido")
        !email.endsWith("@test.com")-> Pair(false, "Ese email no es corporativo")
        else -> Pair (true,"")
    }
}


fun validatePassword(password:String): Pair< Boolean,String>{
    return  when{
        password.isEmpty()-> Pair(false, "La contraseña es requerida")
        password.length < 8 -> Pair(false, "La contraseña debe tener almenos 8 caracteres")
        else -> Pair(true,"")
    }
}

fun validateName(name : String): Pair<Boolean, String>{
    return when{
        name.isEmpty()-> Pair(false, "El nombre es requerido")
        name.length < 3 -> Pair(false, "El nombre debe tener almenos 3 caracteres")
        else -> Pair(true, "")
    }
}

fun validateConfirmPassword(password: String, confirmPassword: String): Pair<Boolean, String>{
    return when{
        confirmPassword.isEmpty()-> Pair(false,"la contraseña es requerida")
        confirmPassword !=password -> Pair(false, "las contraseñas no coinciden")
        else -> Pair(true, "")
    }

}