package pe.edu.idat.ec2carrascodiego

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

val listaLibros = listOf(
    Libro("Libro 01", "Descripcion 01", "2008"),
    Libro("Libro 02", "Descripcion 02", "1994"),
    Libro("Libro 03", "Descripcion 03", "1999"),
    Libro("Libro 04", "Descripcion 04", "1990"),
    Libro("Libro 05", "Descripcion 05", "1999"),
    Libro("Libro 06", "Descripcion 06", "2003"),
    Libro("Libro 07", "Descripcion 07", "2001"),
    Libro("Libro 08", "Descripcion 08", "2004"),
    Libro("Libro 09", "Descripcion 09", "1993"),
    Libro("Libro 10", "Descripcion 10", "1975")
)

@Composable
fun ItemRecycler(libro: Libro){
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
        ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Column(Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = libro.titulo, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = libro.descripcion)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = libro.fechaPublicacion)
            }
        }
    }
}