import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.personatgesmis.ui.theme.PersonatgesMISTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonatgesMISTheme {
                // Un contenedor Surface que utiliza el 'colorScheme.background' del tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    AnimalList()
                }
            }
        }
    }
}

data class Animal(val name: String, val description: String)

@Composable
fun AnimalList() {
    val animals = listOf(
        Animal("Lobo", "Descripción del lobo"),
        Animal("Dragón", "Descripción del dragón"),
        Animal("Fénix", "Descripción del fénix")
        // Agrega más animales a la lista
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(animals.size) { index ->
            val animal = animals[index]
            AnimalListItem(animal)
        }
    }
}

@Composable
fun AnimalListItem(animal: Animal) {
    Column(

    ) {
        Text(
            text = animal.name,
            style = MaterialTheme.typography.body1 // Estilo de texto
        )
        Text(
            text = animal.description,
            style = MaterialTheme.typography.body1 // Estilo de texto
        )
    }
}




