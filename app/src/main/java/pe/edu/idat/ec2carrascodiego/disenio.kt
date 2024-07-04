package pe.edu.idat.ec2carrascodiego

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun disenio() {
    var dni by remember { mutableStateOf("") }
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var sexo by remember { mutableStateOf("") }
    var deporte by remember { mutableStateOf(false) }
    var pintura by remember { mutableStateOf(false) }
    var otroHobby by remember { mutableStateOf(false) }
    var otroHobbyTexto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = dni,
            onValueChange = { dni = it },
            label = { Text("DNI") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            label = { Text("Apellidos") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Sexo")
        Row {
            RadioButton(
                selected = sexo == "Hombre",
                onClick = { sexo = "Hombre" }
            )
            Text("Hombre")
            Spacer(modifier = Modifier.width(16.dp))
            RadioButton(
                selected = sexo == "Mujer",
                onClick = { sexo = "Mujer" }
            )
            Text("Mujer")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Hobbies")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = deporte, onCheckedChange = { deporte = it })
            Text("Deporte")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = pintura, onCheckedChange = { pintura = it })
            Text("Pintura")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = otroHobby, onCheckedChange = { otroHobby = it })
            Text("Otro")
        }
        if (otroHobby) {
            OutlinedTextField(
                value = otroHobbyTexto,
                onValueChange = { otroHobbyTexto = it },
                label = { Text("Ingrese otro hobby") },
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Implementa la lógica de acceso aquí */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Acceder")
        }
    }
}





